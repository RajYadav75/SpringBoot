package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestparamNameEqualToHandlermethodParamName
{
    @GetMapping("/dusra")
    public String process(@RequestParam Integer sid, @RequestParam String sname){
        System.out.println(sid+" "+sname);
        return "dusraHome";
    }
}
