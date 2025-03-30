package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestparamNameEqualToHandlermethodParamName
{
    @GetMapping("/data1")
    public String process(@RequestParam int sid, @RequestParam String sname){
        System.out.println(sid+" "+sname);
        return "dusraHome";
    }
}
