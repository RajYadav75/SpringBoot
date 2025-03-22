package in.raj;

import in.raj.sbeans.WishMessageGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class BootProj02DependencyInjectionApplication {

    @Bean("ldt")
    public LocalDateTime createDT(){
        return LocalDateTime.now();
    }

    public static void main(String[] args) {
        try (ConfigurableApplicationContext ctx = SpringApplication.run(BootProj02DependencyInjectionApplication.class, args);){
            WishMessageGenerator wishMessageGenerator = ctx.getBean("wmg",WishMessageGenerator.class);
            String msg = wishMessageGenerator.wishMsg("Raj");
            System.out.println(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
