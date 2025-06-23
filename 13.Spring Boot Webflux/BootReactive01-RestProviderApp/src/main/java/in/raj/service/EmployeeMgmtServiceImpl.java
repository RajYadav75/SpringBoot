package in.raj.service;

import in.raj.model.Employee;
import in.raj.repository.IEmployeeRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class EmployeeMgmtServiceImpl implements IEmployeeService{
    private IEmployeeRepository repo;
    @Override
    public Mono<Employee> saveEmployee(Employee employee) {
        /*try {
            Thread.sleep(50000);
        }catch (Exception e){
            e.printStackTrace();
        }*/
        return repo.save(employee).switchIfEmpty(Mono.empty());
    }

    @Override
    public Flux<Employee> findAllEmployees() {
        /*try {
            Thread.sleep(50000);
        }catch (Exception e){
            e.printStackTrace();
        }*/
        return repo.findAll().switchIfEmpty(Flux.empty());
    }

    @Override
    public Mono<Employee> findById(Integer id) {
        return repo.findById(id).switchIfEmpty(Mono.empty());
    }

    @Override
    public Mono<Void> removeEmployee(Integer id) {
        return repo.deleteById(id);
    }
}
