package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IfReqParamAndHandlerMtdNameNotMatch {
    @GetMapping("/tisra")
    public String process(@RequestParam String sid, @RequestParam(required = false) String sname){
        System.out.println(sid+" "+sname);
        return "tisraHome";
    }
}
