package com.raj.main;

import com.raj.ston.Printer;

public class SingleTonClassMain {
    public static void main(String[] args) {
        Printer p1 = Printer.getINSTANCE();
        Printer p2 = Printer.getINSTANCE();

        System.out.println(p1.hashCode()+"  "+p2.hashCode());
        System.out.println("p1 == p2?"+(p1 == p2));
    }
}
