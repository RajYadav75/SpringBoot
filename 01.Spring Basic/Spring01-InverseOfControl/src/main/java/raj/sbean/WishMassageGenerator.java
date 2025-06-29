package raj.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component("wmg")
public class WishMassageGenerator {
//    HAS-A-Property
    @Autowired
    private LocalDateTime dateTime;




    // Business Method
    public String generateWishMassage(String user) {
        System.out.println("WishMassageGenerator.generateWishMassage()---> "+dateTime);
        // TODO: Get current Hour of the day
        int hour = dateTime.getHour();
        //TODO: generate the wish message
        if (hour<12){
            return "Good Morning MR--> "+user;
        } else if (hour < 16) {
            return "Good Afternoon MR--> "+user;
        }else if (hour < 18) {
            return "Good Evening MR--> "+user;
        }else{
            return "Good Night MR--> "+user;
        }
    }
}
