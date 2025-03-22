package com.raj.beans;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("bat")
public class CricketBat {

    public CricketBat() {
        System.out.println("CricketBat.0 Param");
    }

    public int scoreRuns(){
        return new Random().nextInt(30);
    }
}
