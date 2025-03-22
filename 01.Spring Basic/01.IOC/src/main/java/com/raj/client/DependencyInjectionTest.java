package com.raj.client;

import com.raj.sbean.WishMessageGenerator;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DependencyInjectionTest {

    public static void main(String[] args) {
        //Create IOC Container

        FileSystemXmlApplicationContext ctx = 
                new FileSystemXmlApplicationContext("src/main/java/com/raj/cfgs/applicationContext.xml");

        // Get target Spring Bean class obj from the IOC container


        Object obj = ctx.getBean("wmg");
//        String result = obj.generateWishMessage("Raja");// Using super class ref we can not call direct methods of sub class. if needed go for typecasting
        WishMessageGenerator generator = (WishMessageGenerator) obj;

        //Invoke the business Method
        String result = generator.generateWishMessage("Raj");
        System.out.println("Result : "+result);

        //Close the IOC container
        ctx.close();
    }// Main
}// Class