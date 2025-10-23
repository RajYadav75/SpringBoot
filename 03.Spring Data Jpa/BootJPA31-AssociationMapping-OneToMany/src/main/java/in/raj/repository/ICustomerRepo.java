package in.raj.repository;

import in.raj.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepo extends JpaRepository<Customer,Integer> {
}
