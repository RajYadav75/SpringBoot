package in.raj;

import in.raj.beans.WishMessageGenerators;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class SpringBootProj01DependencyInjectionApplication {

    @Bean
    public LocalDateTime ldt(){
        return LocalDateTime.now(); //  gives LocalDateTime class obj having system date and time
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootProj01DependencyInjectionApplication.class, args);
            //Get Target Class
        System.out.println("context object class name :: "+run.getClass());
        WishMessageGenerators wishMessageGenerators = run.getBean("wmg", WishMessageGenerators.class);
        String message = wishMessageGenerators.wishMessage("Raj Yadav");
        System.out.println(message);

    }

}
