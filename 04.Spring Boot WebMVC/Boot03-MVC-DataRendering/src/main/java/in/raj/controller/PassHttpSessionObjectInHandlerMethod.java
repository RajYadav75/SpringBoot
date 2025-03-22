package in.raj.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PassHttpSessionObjectInHandlerMethod {
    @RequestMapping("/ra")
    public String process(HttpSession session){
        session.setAttribute("raj","ankita");
        return "httpsessionobject";
    }
}
