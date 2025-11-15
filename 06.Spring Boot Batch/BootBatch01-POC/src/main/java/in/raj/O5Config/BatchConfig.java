package in.raj.O5Config;

import in.raj.O1Reader.BookInfoReader;
import in.raj.O2Processor.BookInfoProcessor;
import in.raj.O3Writer.BookInfoWriter;
import in.raj.O4Listener.JobMonitoringListener;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
    @Autowired
    private JobBuilderFactory jobFactory;
    @Autowired
    private StepBuilderFactory  stepFactory;
    @Autowired
    private BookInfoReader reader;
    @Autowired
    private BookInfoWriter writer;
    @Autowired
    private BookInfoProcessor processor;
    @Autowired
    private JobMonitoringListener listener;

    @Bean(name="step1")
    public Step createSetp1() {
        return  stepFactory.get("step1")
                .<String,String>chunk(3)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }

    @Bean(name="job1")
    public Job createJob1() {
        return  jobFactory.get("job1")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .start(createSetp1())
                .build();
    }
}
