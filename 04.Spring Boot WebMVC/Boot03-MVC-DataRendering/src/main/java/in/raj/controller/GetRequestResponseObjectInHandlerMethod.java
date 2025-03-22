package in.raj.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GetRequestResponseObjectInHandlerMethod {
    @RequestMapping("/ankita")
    public String reqres(HttpServletRequest request, HttpServletResponse response){
        System.out.println("GetRequestResponseObjectInHandlerMethod.reqres");
        request.setAttribute("name","Raj Yadav");
        return "requestResponse";
    }
}
