package in.raj.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class WishMsgGenerator {
    public WishMsgGenerator() {
        System.out.println("WishMsgGenerator.WishMsgGenerator");
    }
    LocalDateTime ldt = LocalDateTime.now();

    public String generateWishMsg() {
        int hour = ldt.getHour();
        if (hour>=1 && hour<=12) {
            return " Good Morning";
        }else if (hour>=13 && hour<=18) {
            return " Good Afternoon";
        }else if (hour>=19 && hour<=20) {
            return " Good Evening";
        }
        else {
            return " Good Night";
        }
    }
}
