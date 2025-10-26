package in.raj.service;

import in.raj.document.Employee;

import java.util.List;

public interface IEmployService {
    public String registerEmploy(Employee employee);
    public String registerBatchEmploy(List<Employee> employees);
    public List<Employee> findEmployBySalaryRange(double start, double end);
    public List<Employee> findEmployByAddress(String address);
    public Employee findEmployById(String id);
    public List<Employee> findEmployBySalaryRangeAndAddress(double start, double end, String... address);
    public String findAndUpdateEmployDataUsingEmployNumber(int employNumber, double newSalary,String newAddress);
    public String findAndUpdateEmployDataUsingEmploySalaryRange(double start, double end, String newAddress);
    public String saveOrUpdateEmployDataUsingEmpNum(int employNumber, double newSalary,String newAddress);
}
