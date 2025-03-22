package in.raj.service;

import in.raj.dao.EmployeeDao;
import in.raj.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeDao empDAO;
    @Override
    public List<Employee> fetchEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
        //use dao
        List<Employee> list=empDAO.getEmpsByDesgs(desg1, desg2, desg3);
        return list;
    }
}
