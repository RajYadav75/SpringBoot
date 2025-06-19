package in.raj.sender;

import in.raj.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class PTPSenderApp implements CommandLineRunner {
    @Autowired
    private JmsTemplate jmsTemplate;
    @Override
    public void run(String... args) throws Exception {
        Product product = new Product(1001,"Raj Yadav",100.0f,40000.0f);
        jmsTemplate.convertAndSend("testmq",product);
        System.out.println("Sender has sent the object as Message");
    }
}
