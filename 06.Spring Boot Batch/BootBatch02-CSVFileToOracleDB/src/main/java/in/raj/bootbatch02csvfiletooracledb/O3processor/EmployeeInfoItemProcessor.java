package in.raj.bootbatch02csvfiletooracledb.O3processor;

import in.raj.bootbatch02csvfiletooracledb.O1model.Employee;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class EmployeeInfoItemProcessor implements ItemProcessor<Employee,Employee> {
    @Override
    public Employee process(Employee employee) throws Exception {
        if(employee.getSalary()>=100000) {
            employee.setGrossSalary(employee.getSalary()+employee.getSalary()*0.4f);
            employee.setNetSalary(employee.getGrossSalary()-employee.getGrossSalary()*0.2f);
            return employee;
        }
        return null;
    }
}
