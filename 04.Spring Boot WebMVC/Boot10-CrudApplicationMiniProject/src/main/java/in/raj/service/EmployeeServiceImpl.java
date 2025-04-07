package in.raj.service;

import in.raj.model.Employee;
import in.raj.repo.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeRepository empRepo;


    @Override
    public String registerEmployee(Employee emp) {
        //TODO: Save the Object
        int empno = empRepo.save(emp).getEmpno();
        return "Employee saved with EmpNo: " + empno;
    }

    @Override
    public List<Employee> fetchAllEmployees() {
        return empRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(int no) {
        Employee emp = empRepo.getReferenceById(no);
        return emp;
    }

    @Override
    public String updateEmployee(Employee emp) {
        Optional<Employee> opt = empRepo.findById(emp.getEmpno());
        if (opt.isPresent()) {
            empRepo.save(emp);
            return "Employee updated with EmpNo: " + emp.getEmpno();
        }
        return emp.getEmpno() +" Employee is not avaiable for the updation";
    }

    @Override
    public String deleteEmployee(int no) {
        empRepo.deleteById(no);
        return "Employee deleted with EmpNo: " + no;
    }
}
