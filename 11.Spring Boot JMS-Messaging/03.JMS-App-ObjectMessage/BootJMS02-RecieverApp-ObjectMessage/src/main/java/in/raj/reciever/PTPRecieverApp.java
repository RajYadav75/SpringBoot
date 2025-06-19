package in.raj.reciever;


import in.raj.model.Product;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class PTPRecieverApp{
    @JmsListener(destination = "testmq")
    public void receiveMessage(Product message){
        System.out.println("Received Message from Queue :: Message : " + message);
    }
}
