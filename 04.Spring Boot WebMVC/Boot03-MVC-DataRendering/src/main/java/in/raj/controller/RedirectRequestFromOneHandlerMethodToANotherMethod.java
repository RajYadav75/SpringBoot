package in.raj.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectRequestFromOneHandlerMethodToANotherMethod {
    @RequestMapping("/redirect")
    public String process(HttpServletRequest request){
        System.out.println("RedirectRequestFromOneHandlerMethodToANotherMethod.process"+request.hashCode());
        request.setAttribute("attr","val");
        return "redirect:report";
    }
    @RequestMapping("/report")
    public String showForward(HttpServletRequest request){
        System.out.println("Request attribute :: "+request.getAttribute("attd"));// Gives Null
        System.out.println("RedirectRequestFromOneHandlerMethodToANotherMethod.showForward");
        return "report";
    }
}
