package in.raj.controller;

import in.raj.model.Employee;
import in.raj.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    private IEmployeeService empService;
    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/showReport")
    public String showEmployeeReport(Map<String ,Object> map) {
        List<Employee> allEmp = empService.getAllEmployees();
        map.put("emps", allEmp);
        return "showEmployeeReport";
    }



}
