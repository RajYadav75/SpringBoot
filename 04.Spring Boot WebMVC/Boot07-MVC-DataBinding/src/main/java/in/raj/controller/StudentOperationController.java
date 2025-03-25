package in.raj.controller;

import in.raj.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class StudentOperationController {
    @GetMapping("/")
    public String showHomePage(){
        return "home-page";
    }

    @GetMapping("/register")
    public String showStudentFormPage(){
        return "register-page";
    }

    @PostMapping("/register")
    public String registerStudent(Map<String, Object> map,@ModelAttribute("stud") Student student){
        System.out.println(student);
        return "show-register-page";
    }
}
