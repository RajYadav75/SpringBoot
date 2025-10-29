package in.raj.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class GenerateReport {

    /*@Scheduled(initialDelay = 2000, fixedDelay = 1000)
    *//**
     * ⚙️ 1. initialDelay क्या होता है?
     * ➡️ initialDelay बताता है कि method पहली बार चलने से पहले कितनी देर इंतज़ार करे।
     * initialDelay = 2000
     * इसका मतलब है —
     *
     * जब Spring Boot एप्लिकेशन start होगी, तो यह method 2 सेकंड (2000 milliseconds) बाद पहली बार चलेगा।
     *
     * 🕒 यानी, एप्लिकेशन चालू होते ही ये तुरंत नहीं चलेगा,
     * पहले 2 सेकंड रुकेगा, फिर execute होगा।
     *//*
    *//**
     * 🔁 Parameter 2: fixedDelay = 1000
     * 👉 इसका मतलब है —
     * यह method हर बार execute होने के 1 सेकंड बाद फिर से चलेगा।
     * *//*
    public void generateReport1() {
        System.out.println("GenerateReport.generateReport()-- Generating report 1..."+new Date()+Thread.currentThread());
    }*/
   /* @Scheduled(fixedDelay = 3000)
    public void generateReport2() {
        System.out.println("GenerateReport.generateReport()-- Generating report 2..."+new Date()+Thread.currentThread());
    }*/
    /*@Scheduled(fixedDelay = 3000)
    public void generateReport3() {
        System.out.println("GenerateReport.generateReport()-- Generating report 3..."+new Date()+" Start");
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("End of generating Report method 3..."+new Date()+" End");
    }*/
    /*@Scheduled(fixedRate = 10000)
    public void generateReport4() {
        System.out.println("GenerateReport.generateReport()-- Generating report 3..."+new Date()+" Start");
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("End of generating Report method 3..."+new Date()+" End");
    }*/
    /*@Scheduled(fixedRate = 10000)
    public void generateReport5() {
        System.out.println("GenerateReport.generateReport()-- Generating report 3..."+new Date()+" Start");
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("End of generating Report method 3..."+new Date()+" End");
    }*/
    @Scheduled(initialDelay = 2000,fixedDelay = 3000)
    public   void  showReport1() {
        System.out.println("report1 on(start) ::"+new Date()+"----"+Thread.currentThread());
        System.out.println("Thread(task1) name ::"+Thread.currentThread().getName());
        System.out.println("Thread(task1) hashcode ::"+Thread.currentThread().hashCode());
        System.out.println("report1 on(end) ::"+new Date()+"----"+Thread.currentThread());
    }
    @Scheduled(initialDelay = 2000,fixedDelay = 5000)
    public   void  showReport2() {
        System.out.println("report2 on(start) ::"+new Date()+"----"+Thread.currentThread());
        System.out.println("Thread(task2) name ::"+Thread.currentThread().getName());
        System.out.println("Thread(task2) hashcode ::"+Thread.currentThread().hashCode());
        System.out.println("report2 on(end) ::"+new Date()+"----"+Thread.currentThread());
    }

}
