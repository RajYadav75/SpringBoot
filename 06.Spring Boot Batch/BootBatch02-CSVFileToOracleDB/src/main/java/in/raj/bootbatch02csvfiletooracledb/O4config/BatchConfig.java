package in.raj.bootbatch02csvfiletooracledb.O4config;

import in.raj.bootbatch02csvfiletooracledb.O1model.Employee;
import in.raj.bootbatch02csvfiletooracledb.O2listener.JobMonitoringListener;
import in.raj.bootbatch02csvfiletooracledb.O3processor.EmployeeInfoItemProcessor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;
    @Autowired
    private JobMonitoringListener listener;
    @Autowired
    private EmployeeInfoItemProcessor processor;
    @Autowired
    private DataSource dataSource;

    @Bean(name="reader")
    public FlatFileItemReader<Employee> createFFIReader() {
        //Create Reader Object
        FlatFileItemReader<Employee> reader = new FlatFileItemReader<>();
        //Set csv file as resource
        reader.setResource(new ClassPathResource("EmployeeInfo.csv"));
        // create the LineMapper  (To get each record of CSV file)
        DefaultLineMapper<Employee> lineMapper = new DefaultLineMapper<>();
        // create the DelimitedLineTokenizer
        DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
        tokenizer.setDelimiter(",");
        tokenizer.setNames("eno","ename","eadd","salary");
        //create FieldSetMapper to  convert the tokens of each line into Model class object
        BeanWrapperFieldSetMapper<Employee> mapper=new BeanWrapperFieldSetMapper<Employee>();
        mapper.setTargetType(Employee.class);
        //set Tokenize and fieldSetMapper to LineMapper
        lineMapper.setLineTokenizer(tokenizer);
        lineMapper.setFieldSetMapper(mapper);
        //set LineMapper to reader
        reader.setLineMapper(lineMapper);
        //return  reader
        return reader;
    }

    @Bean(name="writer")
    public JdbcBatchItemWriter<Employee> createWriter(){
        //create the writer object
        JdbcBatchItemWriter<Employee> writer=new JdbcBatchItemWriter<Employee>();
        //set datasource
        writer.setDataSource(dataSource);
        //set SQL Query
        writer.setSql("INSERT INTO BATCH_EMPLOYEEINFO VALUES(:empNo,:eName,:eadd,:salary,:grossSalary,:netSalary)");
        //set Employee class obj data as the named parameter values in the INSERT SQL Query
        BeanPropertyItemSqlParameterSourceProvider<Employee> source=
                new BeanPropertyItemSqlParameterSourceProvider<Employee>();
        writer.setItemSqlParameterSourceProvider(source);
        //return  writer object
        return writer;
    }

    @Bean(name="step1")
    public Step createStep1() {
        return  stepBuilderFactory.get("step1")
                .<Employee,Employee>chunk(10)
                .reader(createFFIReader())
                .writer(createWriter())
                .processor(processor)
                .build();

    }

    @Bean(name="job1")
    public Job createJob1() {
        return  jobBuilderFactory.get("job1")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .start(createStep1())
                .build();

    }
}
