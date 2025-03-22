package in.raj.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class PassServletConfigContextObjectInController {

    @Autowired
    private ServletConfig sc;
    @Autowired
    private ServletContext cs;
    @RequestMapping("/configcontext")
    public String process(Map<String,Object> map){
        System.out.println("Web Application context path :: "+cs.getContextPath());
        System.out.println("DS Logical name :: "+sc.getServletName());
        map.put("name","Raj Yadav");
        map.put("gf","Ankita Tiwari");
        return "PassServletConfigContextObjectInController";
    }
}
