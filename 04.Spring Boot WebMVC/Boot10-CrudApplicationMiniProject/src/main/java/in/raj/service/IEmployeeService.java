package in.raj.service;

import in.raj.model.Employee;

import java.util.List;

public interface IEmployeeService {
    public String registerEmployee(Employee emp);
    public List<Employee> fetchAllEmployees();
    public Employee getEmployeeById(int no);
    public String updateEmployee(Employee emp);
    public String deleteEmployee(int no);

}
