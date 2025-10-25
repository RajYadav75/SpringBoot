package in.raj.repository;

import in.raj.document.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IEmployRepo extends MongoRepository<Employee, Integer> {
}
