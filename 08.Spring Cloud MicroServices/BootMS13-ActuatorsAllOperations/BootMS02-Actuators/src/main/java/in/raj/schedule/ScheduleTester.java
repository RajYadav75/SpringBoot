package in.raj.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduleTester {
    @Scheduled(cron = "0/15 * * * * *")
    public void showReport() {
        System.out.println("ScheduleTester.showReport on :: "+new Date());
    }
}
