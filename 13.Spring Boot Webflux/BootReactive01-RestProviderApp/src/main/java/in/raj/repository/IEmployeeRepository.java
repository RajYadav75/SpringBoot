package in.raj.repository;

import in.raj.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IEmployeeRepository extends ReactiveMongoRepository<Employee, Integer> {
}
