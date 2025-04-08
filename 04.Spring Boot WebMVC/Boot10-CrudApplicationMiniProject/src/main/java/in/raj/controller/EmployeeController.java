package in.raj.controller;

import in.raj.model.Employee;
import in.raj.service.IEmployeeService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Map;


@Controller
public class EmployeeController {

    @Autowired
    private IEmployeeService empService;
    @GetMapping("/")
    public String showHomePage() {
        return "home";
    }
    //TODO:- For Getting OR Hitting Report Page
    @GetMapping("report")
    public String showEmployReport(Map<String,Object> map){
        System.out.println("EmployeeController.showEmployReport()");
        //TODO:-Use Service
        List<Employee> empList = empService.fetchAllEmployees();
        //TODO:- keep the results in Model attribute
        map.put("empInfo", empList);
        //TODO:- Return Logical View Name
        return "showEmployeeReport";
    }

    //TODO:- For Getting OR Hitting Register Page
    @GetMapping("register")
    public String showRegisterEmployeeFormPage(@ModelAttribute("emp") Employee emp) {
        System.out.println("EmployeeController.showRegisterEmployeeFormPage()");
        //TODO:- Return Logical View Name
        return "registerEmployeeForm";
    }
    //TODO:- To Submit Data into Database from Register Page
   /* @PostMapping("register")   //TODO:- gives  Double Posting or Duplicate formSubmission problem
    public String registerEmployForm(Map<String,Object> map,@ModelAttribute("emp") Employee emp) {
        System.out.println("EmployeeController.registerEmployForm()");
        // TODO:- Use service
        String msg = empService.registerEmployee(emp);
        List<Employee> list = empService.fetchAllEmployees();
        //TODO:- Keep the result in Model Attribute
        map.put("resultMsg", msg);
        map.put("empInfo", list);
        //TODO:- Return LVN
        return "showEmployeeReport";
    }*/

    /*@PostMapping("/register")  //TODO:- Solved PRG problem ( Solved Double Posting Problem)
    public String showEditEmployeeFormPage(Map<String,Object> map,@ModelAttribute("emp") Employee emp) {
        System.out.println("EmployeeController.showEditEmployeeFormPage()");
        //use Services
        String msg = empService.registerEmployee(emp);
        map.put("resultMsg", msg);
        return "redirect:report";
    }*/
    /*@PostMapping("/register")   //TODO:-  PRG Pattern ---> solves  Double Posting Problem  + Flash attributes
    public   String   processRegisterEmployeeFormPage(RedirectAttributes attrs,
                                                      @ModelAttribute("emp") Employee emp) {
        System.out.println("EmployeeOperationsController.processRegisterEmployeeFormPage()");
        //use service class
        String msg=empService.registerEmployee(emp);
        //keep the results in Model attribute
        attrs.addFlashAttribute("resultMsg", msg);
        //retrun LVN
        return "redirect:report";
    }*/

    @PostMapping("/register")   //  PRG Pattern ---> solves  Double Posting Problem  + Session Attributes
    public   String   processRegisterEmployeeFormPage(HttpSession ses,
                                                      @ModelAttribute("emp") Employee emp) {
        System.out.println("EmployeeOperationsController.processRegisterEmployeeFormPage()");
        //use service class
        String msg=empService.registerEmployee(emp);
        //keep the results in Model attribute
        ses.setAttribute("resultMsg", msg);
        //retrun LVN
        return "redirect:report";
    }

    @GetMapping("/edit")
    public String showEditEmployeeFormPage(@RequestParam("no") int no, @ModelAttribute("emp") Employee emp) {
        //Use Service
        System.out.println("EmployeeController.showEditEmployeeFormPage()");
        Employee emply = empService.getEmployeeById(no);
        // Keep the emply object data to  Model class Obj emp
        BeanUtils.copyProperties(emply, emp);
        //Return LVN
        return "editEmployForm";
    }
    @PostMapping("/edit")
    public String processEditEmployeeForm(@ModelAttribute("emp") Employee emp, RedirectAttributes attr) {
        //Use Service
        String s = empService.updateEmployee(emp);
        attr.addFlashAttribute("msg", s);
        return "redirect:report";
    }
    @GetMapping("/delete")
    public String deleteEmploy(@RequestParam("no") int no,RedirectAttributes attr) {
        String msg = empService.deleteEmployee(no);
        attr.addFlashAttribute("msg", msg);
        return "redirect:report";
    }
}
