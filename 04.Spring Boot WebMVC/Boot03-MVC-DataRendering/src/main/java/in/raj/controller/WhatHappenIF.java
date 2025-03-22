package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WhatHappenIF {


    //TODO:- What happen if return type of handler method is void
    // Ans It take request path("raj") as Logical view name

    /*@RequestMapping("whathappenif")
    public void process(Map<String,Object> map){
        map.put("fname","Raj");
        map.put("lname","Ankita");
    }*/


    //TODO:- What happen if  handler method is return null
    // Ans It take request path("raj") as Logical view name

    @RequestMapping("whathappenif")
    public String  process(Map<String,Object> map){
        map.put("fname","Raj");
        map.put("lname","Ankita");
        return null;
    }
}
