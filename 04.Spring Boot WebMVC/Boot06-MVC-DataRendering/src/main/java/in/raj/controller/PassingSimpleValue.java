package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class PassingSimpleValue {
    @GetMapping("/")
    public String showHomePage() {
        return "home";
    }


    /*todo: Passing Simple Value in to Controller to Views template */
    @GetMapping("/simple")
    public String simpleValue(Map<String, Object> map) {
        map.put("message", "Hello World");
        map.put("number", 07);
        return "report";
    }
}
