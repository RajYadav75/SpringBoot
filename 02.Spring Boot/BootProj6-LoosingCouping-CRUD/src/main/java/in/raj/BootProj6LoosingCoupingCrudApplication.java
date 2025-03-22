package in.raj;

import in.raj.controller.EmployController;
import in.raj.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.util.List;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,JdbcTemplateAutoConfiguration.class })
@SpringBootApplication
public class BootProj6LoosingCoupingCrudApplication {
    @Autowired
    private Environment env;

	/*@Bean(name="c3P0Ds")
	public    DataSource   createC3P0DS() throws Exception{
		ComboPooledDataSource  c3Ds=new ComboPooledDataSource();
		c3Ds.setDriverClass(env.getRequiredProperty("spring.datasource.driver-class-name"));
		c3Ds.setJdbcUrl(env.getRequiredProperty("spring.datasource.url"));
		c3Ds.setUser(env.getRequiredProperty("spring.datasource.username"));
		c3Ds.setPassword(env.getRequiredProperty("spring.datasource.password"));
		c3Ds.setInitialPoolSize(Integer.parseInt(env.getRequiredProperty("c3p0.minSize")));
		c3Ds.setMaxPoolSize(Integer.parseInt(env.getRequiredProperty("c3p0.maxSize")));


		return c3Ds;
	}*/

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(BootProj6LoosingCoupingCrudApplication.class, args);
        //get Controller class obj
        EmployController controller = ctx.getBean("empController", EmployController.class);
        //invoke the b.methods
        try {
            List<Employee> list=controller.showEmployeesByDesgs("CLERK","MANAGER", "SALESMAN");
            list.forEach(emp->{
                System.out.println(emp);
            });
        }//try
        catch(Exception e) {
            e.printStackTrace();
        }

        //close the container
        ctx.close();
    }

}
