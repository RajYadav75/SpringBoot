package in.raj.controller;

import in.raj.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class EmployController {
    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    @GetMapping("/employ")
    public String showEmployee(@ModelAttribute("empl") Employee employee){
        return "emp";
    }

    @PostMapping("/emp")
    public String saveEmployee(Map<String,Object> map,@ModelAttribute("empl") Employee employee){
        String msg = "Form Submitted";
        map.put("frmMsg", msg);
        return "showEmployee";
    }
}
