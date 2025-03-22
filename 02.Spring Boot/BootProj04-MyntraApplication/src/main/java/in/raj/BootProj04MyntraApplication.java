package in.raj;

import in.raj.sbeans.MyntraApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootProj04MyntraApplication {

    public static void main(String[] args) {
        try(ConfigurableApplicationContext context =
                    SpringApplication.run(BootProj04MyntraApplication.class, args);){
            MyntraApp myn = context.getBean(MyntraApp.class);
            myn.useService();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
