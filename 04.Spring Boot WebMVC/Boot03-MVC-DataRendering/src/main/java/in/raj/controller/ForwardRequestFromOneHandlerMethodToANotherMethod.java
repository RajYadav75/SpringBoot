package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwardRequestFromOneHandlerMethodToANotherMethod {

   /* @RequestMapping("/frwd")
    public String process(){
        System.out.println("ForwardRequestFromOneHandlerMethodToANotherMethod.process");
        return "forward:report";
    }
    @RequestMapping("/report")
    public String showForward(){
        System.out.println("ForwardRequestFromOneHandlerMethodToANotherMethod.showForward");
        return "report";
    }*/
}
