package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Set;

@Controller
public class CollectionReturning {
    @GetMapping("/collection")
    public String process(@RequestParam Integer id, @RequestParam String name, @RequestParam String[] saddArray, @RequestParam List saddList, @RequestParam Set saddSet) {
        System.out.println(id+" "+name+" "+saddArray+" "+saddList+" "+saddSet);
//Return LVN
        return "collection-result";
    }
}
