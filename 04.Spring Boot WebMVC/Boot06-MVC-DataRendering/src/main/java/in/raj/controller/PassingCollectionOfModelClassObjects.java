package in.raj.controller;

import in.raj.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class PassingCollectionOfModelClassObjects {

    @GetMapping("/collection")
    public String process(Map<String, Object> model) {
        // Create collection of Model class objects
        List<Employee> empLists =  List.of(new Employee(1001,"Raj Yadav",90000.00), new Employee(1002,"Ankita ",80000.00));
        // Add collections of Model class object to model attribute
        model.put("empLists", empLists);
        //Return Logical view name
        return "passingCollectionOfModelClassObjects";

    }
}
