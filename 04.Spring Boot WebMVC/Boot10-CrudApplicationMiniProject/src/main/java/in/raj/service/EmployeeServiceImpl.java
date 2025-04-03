package in.raj.service;

import in.raj.model.Employee;
import in.raj.repo.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeRepository empRepo;


    @Override
    public List<Employee> getAllEmployees() {
        return empRepo.findAll();
    }
}
