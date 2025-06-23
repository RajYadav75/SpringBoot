package in.raj.rest;

import in.raj.model.Employee;
import in.raj.service.EmployeeMgmtServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employee")
public class EmployeeOperationsController {
    @Autowired
    private EmployeeMgmtServiceImpl service;

    @PostMapping("/save")
    public Mono<Employee> saveOneEmployee(@RequestBody Employee employee) {
        System.out.println("Save (-) "+Thread.currentThread().hashCode());
        Mono<Employee> employeeMono = service.saveEmployee(employee);
        return employeeMono;
    }

    @GetMapping("/all")
    public Flux<Employee> getAllEmployee(){
        System.out.println("Get All Employee All(-) "+Thread.currentThread().hashCode());
        return service.findAllEmployees();
    }

    @GetMapping("/one/{id}")
    public Mono<Employee> getOneEmployee(@PathVariable Integer id) {
        System.out.println("Get One Employee(-) "+Thread.currentThread().hashCode());
        Mono<Employee> employeeMono = service.findById(id);
        return employeeMono;
    }
    @DeleteMapping("/remove/{id}")
    public Mono<Void>  removeEmployee(@PathVariable Integer id) {
        System.out.println("Remove Employee(-) "+Thread.currentThread().hashCode());
        return service.removeEmployee(id);
//        service.removeEmployee(id);
//        return Mono.just("Employee Deleted !!");
    }
}
