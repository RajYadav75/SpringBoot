package in.raj.service;

import in.raj.model.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> fetchEmployeesByDesgs(String desg1, String desg2, String desg3 )throws Exception;
}
