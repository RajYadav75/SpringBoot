package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RajController {
    @GetMapping("/data")
    public String data(@RequestParam("sno") int no,@RequestParam("sname") String name) {
        System.out.println(no+" "+name);
        //Return Logical View Name
        //TODO:- http://localhost:8080/data?sno=1&sname=RajYadav
        return "home";
    }
}
