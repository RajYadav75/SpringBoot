package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {
    @RequestMapping("/")
    public String homePage(){
        // Return Logical view name
        return "welcomepage";
    }
}
