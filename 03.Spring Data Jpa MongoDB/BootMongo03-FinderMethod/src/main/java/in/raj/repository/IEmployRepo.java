package in.raj.repository;

import in.raj.document.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IEmployRepo extends MongoRepository<Employee, Integer> {
    public List<Employee> findByEmploySalaryBetween(Double salaryStart, Double salaryEnd);
    public List<Employee> findByEmployNameIn(String ...names);
}
