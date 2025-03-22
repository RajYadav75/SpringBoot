package com.raj.ston;

public class Printer {
    //TODO: static ref variable to hold single object ref
    private static Printer INSTANCE;

    //TODO: Zero param constructor
    private Printer(){
        System.out.println(" 0-Param Constructor  => Printer.Printer");
    }

    //TODO: public static factory method having singleton logic
    public static Printer getINSTANCE(){
        // singleton logic
        if(INSTANCE == null){
            INSTANCE = new Printer();
        }
        return INSTANCE;
    }
}
