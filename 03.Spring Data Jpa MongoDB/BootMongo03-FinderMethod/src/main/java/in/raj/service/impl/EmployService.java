package in.raj.service.impl;

import in.raj.document.Employee;
import in.raj.repository.IEmployRepo;
import in.raj.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployService implements IEmployService {
    @Autowired
    private IEmployRepo employRepo;

    @Override
    public List<Employee> findByEmploySalaryBetween(Double salaryStart, Double salaryEnd) {
        List<Employee> list = employRepo.findByEmploySalaryBetween(salaryStart, salaryEnd);
        return list;
    }

    @Override
    public List<Employee> findByEmployNameIn(String... names) {
        return employRepo.findByEmployNameIn(names);
    }
}
