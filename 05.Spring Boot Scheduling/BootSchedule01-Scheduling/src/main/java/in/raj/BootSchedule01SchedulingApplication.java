package in.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class BootSchedule01SchedulingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootSchedule01SchedulingApplication.class, args);
        System.out.println("BootSchedule01SchedulingApplication.main()-- app started at :: "+new Date());
    }

}
