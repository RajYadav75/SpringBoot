package in.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
    @Autowired
    @Qualifier("pEng")
    private Engine engine;

    public void move(String from, String to){
        engine.start();
        System.out.println("Journey Started "+from);
        engine.stop();
        System.out.println("Journey Ended "+to);
    }


}
