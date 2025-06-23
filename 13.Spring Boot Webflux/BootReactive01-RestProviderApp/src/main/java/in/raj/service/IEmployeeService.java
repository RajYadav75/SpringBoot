package in.raj.service;

import in.raj.model.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IEmployeeService {
    public Mono<Employee> saveEmployee(Employee employee);
    public Flux<Employee> findAllEmployees();
    public Mono<Employee> findById(Integer id);
    public Mono<Void> removeEmployee(Integer id);
}
