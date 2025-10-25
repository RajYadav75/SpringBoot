package in.raj.service;

import in.raj.document.Employee;

import java.util.List;

public interface IEmployService {
    public String registerEmploy(Employee employ);
    public List<Employee> showAllEmploys();
}
