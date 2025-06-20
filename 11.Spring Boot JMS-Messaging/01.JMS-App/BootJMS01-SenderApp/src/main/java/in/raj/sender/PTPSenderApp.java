package in.raj.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class PTPSenderApp implements CommandLineRunner {
    @Autowired
    private JmsTemplate template;
    @Override
    public void run(String... args) throws Exception {
        template.send("testmq1",session -> session.createTextMessage("From the Sender :: "+new Date()));
        System.out.println(" Sender has sent the message");
    }
}
