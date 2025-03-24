package in.raj.controller;

import in.raj.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class PassingModelClassObject {
    @GetMapping("/modelObj")
    public String process(Map<String, Object> map) {
        Employee emp = new Employee();
        emp.setId(1000);
        emp.setName("Raj");
        emp.setSalary(789563.00);
        map.put("emp", emp);
        return "passingModelClassObject";
    }
}
