package com.raj.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("wmg")
public class WishMessageGenerator {
    @Autowired
    private LocalDateTime ldt;

    public WishMessageGenerator() {
        System.out.println("WishMessageGenerator.WishMessageGenerator");
    }

    public String generateMassage(String user){
        int hour = ldt.getHour();
        if (hour < 12){
            return "Good Morning :: "+user;
        } else if (hour < 16) {
            return "Good After Noon :: "+user;
        } else if (hour < 20) {
            return "Good Evening :: "+ user;
        }else {
            return "Good Night :: "+user;
        }
    }
}
