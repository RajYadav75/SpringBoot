package in.raj.controller;

import in.raj.model.Employee;
import in.raj.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("empController")
public class EmployController {
    @Autowired
    private IEmployeeService empService;

    public   List<Employee>  showEmployeesByDesgs(String desg1,String desg2,String desg3)throws Exception{
        //use service
        List<Employee> list= empService.fetchEmployeesByDesgs(desg1, desg2, desg3);
        return  list;

    }

}
