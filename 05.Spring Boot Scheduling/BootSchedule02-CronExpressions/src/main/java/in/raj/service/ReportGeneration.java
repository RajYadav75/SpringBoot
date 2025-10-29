package in.raj.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReportGeneration {


    @Scheduled(cron = "15 * * * * * ")
    public void  generateReport1() {
        System.out.println("Sales report on ::"+new Date());
    }

    @Scheduled(cron = "0 16 22 * * *")
    public void  generateReport2() {
        System.out.println("Sales report on ::"+new Date());
    }

    @Scheduled(cron = "1 18 22 * * *")
    public void  generateReport3() {
        System.out.println("Sales report on ::"+new Date());
    }

    @Scheduled(cron = "* * * * * *")
    public void  generateReport4() {
        System.out.println("Sales report on ::"+new Date());
    }

    @Scheduled(cron = "0 1 18 22,23 * *")
    public void  generateReport5() {
        System.out.println("Sales report on ::"+new Date());
    }



    @Scheduled(cron = "10 20 9-14 * * *")
    public void  generateReport6() {
        System.out.println("Sales report on ::"+new Date());
    }

    @Scheduled(cron = "10-20 20 9 * * *")
    public void  generateReport7() {
        System.out.println("Sales report on ::"+new Date());
    }

    @Scheduled(cron = "@hourly")
    public void  generateReport8() {
        System.out.println("Sales report on ::"+new Date());
    }

    @Scheduled(cron="0/20  *   *  *  *  *")
    public void generateReport9() {
        System.out.println("Sales report on ::"+new Date());
    }

    @Scheduled(cron="10  0/2   *  *  *  *")
    public void generateReport10() {
        System.out.println("Sales report on ::"+new Date());
    }

    @Scheduled(cron="30   48/1    7  *  *  *")
    public void generateReport11() {
        System.out.println("Sales report on ::"+new Date());
    }

    @Scheduled(cron="0/10   7/2    8  *  *  *")
    public void generateReport12() {
        System.out.println("Sales report on ::"+new Date());
    }

    @Scheduled(cron="0 46 7 * * 5#1")
    public void generateReport13() {
        System.out.println("Sales report on ::"+new Date());
    }

    @Scheduled(cron="0 1 8  3W *  *")
    public void generateReport14() {
        System.out.println("Sales report on ::"+new Date());
    }

    @Scheduled(cron="${cron.expr}")
    public void generateReport15() {
        System.out.println("Sales report on ::"+new Date());
    }
}
