package in.raj.controller;

import in.raj.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class StudentController {

    @GetMapping("/")
    public String showHomePage(){
        return "index";
    }
    @GetMapping("/register")
    public String showForm(@ModelAttribute("stud") Student student){
        //return Logical View Name
        return "form";
    }

    @PostMapping("/register")
    public String processRegister(Map<String,Object> map,@ModelAttribute("stud") Student student){
        //Generate Result
        String grade = null;

        if (student.getAverage()>=75){
            grade = "First class with Dist";
        }
        else if (student.getAverage()>=70){
            grade = "First Class";
        }
        else if (student.getAverage()>=60){
            grade = "Second Class";
        }
        else if (student.getAverage()>=35){
            grade = "Third Class";
        }
        else{
            grade = "Nalayak Hai aapka Ladka";
        }

        // Keep result in Model Attributes
        map.put("result", grade);
        //return LVN
        return "showResult";
    }

}
