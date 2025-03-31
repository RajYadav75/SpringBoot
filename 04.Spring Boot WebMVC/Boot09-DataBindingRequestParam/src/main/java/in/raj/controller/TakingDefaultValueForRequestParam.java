package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TakingDefaultValueForRequestParam {
    @GetMapping("/forth")
    public String show(@RequestParam Integer no, @RequestParam(defaultValue = "Raj Yadav Ankita ") String name) {
        System.out.println(no+" "+name);
        return "forthHome";
    }
}
