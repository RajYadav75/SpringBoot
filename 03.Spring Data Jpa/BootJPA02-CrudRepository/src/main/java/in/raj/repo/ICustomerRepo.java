package in.raj.repo;

import in.raj.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepo extends CrudRepository<Customer,Integer> {
}
