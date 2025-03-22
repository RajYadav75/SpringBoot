package com.raj.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("wmg")
public class WishMessageGenerator {  //Target Spring bean class
    //HAS-A-Property
    private LocalDateTime dateTime;

    public void setDateTime(){
        System.out.println("0-Params Constructor method");
    }
    //Setter Method for Setter Injection
    @Autowired
    public void setDateTime(LocalDateTime dateTime) {
        System.out.println("WishMessageGenerator.setDateTime()");
        this.dateTime = dateTime;
    }

    // Business Method
    public String generateWishMessage(String user){
        System.out.println("WishMessageGenerator.generateWishMessage()");

        // Get current hour of the day
        int hour = dateTime.getHour();
        // Generate Wish Message
        if(hour<12){
            return "Good Morning";
        }
        else if (hour<16){
            return "Good After Noon";
        } else if (hour<20) {
            return "Good Evening";
        }
        else{
            return "Good Night";
        }
    }
}
