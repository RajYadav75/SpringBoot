package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GetPostRequestingController {

    @RequestMapping(value = "/report",method = RequestMethod.GET)
    public String showHome(){
        return "index";
    }
    @RequestMapping(value = "/report",method = RequestMethod.POST)
    public String showHome1(){
        return "index";
    }
}
