package in.raj.service;

import in.raj.document.Employee;

import java.util.List;

public interface IEmployService {
    public List<Employee> findByEmploySalaryBetween(Double salaryStart, Double salaryEnd);
    public List<Employee> findByEmployNameIn(String ...names);
}
