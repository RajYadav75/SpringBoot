package in.raj.reciever;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class PTPRecieverApp {

    @JmsListener(destination = "testmq1")
    public void readMsg(String msg){
        System.out.println("Reciever received :: "+msg);
    }
}
