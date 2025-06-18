package in.raj.senderScheduling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class PTPSenderApp {
    @Autowired
    private JmsTemplate jmsTemplate;
    @Scheduled(cron = "*/10 * * * * *")
    public void sendMessage(){
        jmsTemplate.send("rajmq",session -> session.createTextMessage("From the Sender :: "+new Date()));
        System.out.println("Sender has sent the message");
    }
}
