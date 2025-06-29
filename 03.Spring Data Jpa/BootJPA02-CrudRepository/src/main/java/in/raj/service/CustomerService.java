package in.raj.service;

import in.raj.entity.Customer;
import in.raj.repo.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepo customerRepo;
    @Override
    public String registerCustomer(Customer customer) {
        System.out.println("Customer Id before insertion :: "+customer.getId());
        Customer cus = customerRepo.save(customer);
        return "Customer Id after insertion :: "+cus.getId();
    }
}
