package in.raj.reciever;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class PTPRecieverApp {

    @JmsListener(destination = "rajmq")
    public void receiveMessage(String message) {
        System.out.println("Recieved Message: " + message);
    }
}
