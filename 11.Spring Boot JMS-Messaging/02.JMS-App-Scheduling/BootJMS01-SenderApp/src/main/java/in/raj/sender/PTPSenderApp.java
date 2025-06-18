package in.raj.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class PTPSenderApp implements CommandLineRunner {
    @Autowired
    private JmsTemplate jmsTemplate;
    @Override
    public void run(String... args) throws Exception {
        jmsTemplate.send("rajmq",session -> session.createTextMessage("From the Sender :: "+new Date()));
        System.out.println("Sender has sent     the message");
    }
}
