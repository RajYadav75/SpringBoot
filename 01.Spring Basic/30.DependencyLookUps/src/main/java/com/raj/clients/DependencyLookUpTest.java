package com.raj.clients;

import com.raj.beans.Cricketer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyLookUpTest {
    public static void main(String[] args)  {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("com/raj/cfgs/applicationContext.xml");
        Cricketer cktr = ctx.getBean("cktr", Cricketer.class);
        //Invoke the business method
        try {
            cktr.batting();
            cktr.wicketKeeping();
            cktr.bowling();
            cktr.fielding();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
