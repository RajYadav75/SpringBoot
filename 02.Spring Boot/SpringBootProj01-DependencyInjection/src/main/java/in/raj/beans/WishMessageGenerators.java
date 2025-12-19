package in.raj.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component("wmg")
public class WishMessageGenerators {
    @Autowired
    private LocalDateTime dateTime;

    public WishMessageGenerators() {
        System.out.println("WishMessageGenerators.WishMessageGenerators -0-param constructor");
    }

    public String   wishMessage(String user){
        int hour = dateTime.getHour();
        if (hour <12){
            return "Good Morning "+user;
        } else if (hour > 12 && hour < 16) {
            return "Good After Noon "+user;
        } else if (hour > 16 && hour < 19) {
            return "Good Evening "+user;
        }else{
            return "Good Night "+user;
        }
    }
}
