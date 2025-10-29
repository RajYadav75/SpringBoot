package in.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class BootSchedule02CronExpressionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootSchedule02CronExpressionsApplication.class, args);
        System.out.println("BootSchedulingProj02Application.main()-- App started at::"+new Date());
    }

}
