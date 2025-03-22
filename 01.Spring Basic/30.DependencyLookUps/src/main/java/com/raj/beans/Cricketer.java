package com.raj.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
@PropertySource("com/raj/commons/info.properties")
public class Cricketer {
    @Value("${cktr.id}")
    private Integer id;
    @Value("${cktr.name}")
    private String name;
    @Value("${cktr.jersyNo}")
    private Integer jersyNo;


    public Cricketer() {
        System.out.println("Cricketer:: 0 param");
    }

    public void bowling(){
        System.out.println(name+" cricketer is bowling");
    }

    public void fielding(){
        System.out.println(name+" cricketer is fielding");
    }


    public void wicketKeeping(){
        System.out.println(name + " cricketer is wicket keeping");
    }


    public void batting(){
        System.out.println(" cricketer is batting");
        // craete an extra IOC container
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/raj/cfgs/applicationContext.xml");

        // Get dependent class obj through Dependency lookup
//        CricketBat bat = ctx.getBean("bat", CricketBat.class);
        CricketBat bat = ctx.getBean(CricketBat.class);


        //use dependent class obj
        int runs = bat.scoreRuns();

        System.out.println(name+" cricketer is batting and score runs :: "+runs);



    }

}
