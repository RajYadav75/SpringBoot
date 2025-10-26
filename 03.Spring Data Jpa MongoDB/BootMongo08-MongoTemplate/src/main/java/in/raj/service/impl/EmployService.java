package in.raj.service.impl;

import com.mongodb.client.result.UpdateResult;
import in.raj.document.Employee;
import in.raj.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class EmployService implements IEmployService {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public String registerEmploy(Employee employee) {
        Integer employNumber = mongoTemplate.save(employee).getEmployNumber();
        return "Employee Registered with Employ Number: " + employNumber;
    }

    @Override
    public String registerBatchEmploy(List<Employee> employees) {
        Collection<Employee> employeeCollection = mongoTemplate.insertAll(employees);

        return employeeCollection.size() + " Employees Registered Successfully";
    }

    @Override
    public List<Employee> findEmployBySalaryRange(double start, double end) {
        Query query = new Query();
        query.addCriteria(Criteria.where("employSalary").gte(start).lte(end));
        List<Employee> employees = mongoTemplate.find(query, Employee.class);
        return employees;
    }

    @Override
    public List<Employee> findEmployByAddress(String address) {
        Query query = new Query();
        query.addCriteria(Criteria.where("employAddress").is(address));
        List<Employee> employees = mongoTemplate.find(query, Employee.class);
        return employees;
    }

    @Override
    public Employee findEmployById(String id) {
        return mongoTemplate.findById(id, Employee.class);
    }

    @Override
    public List<Employee> findEmployBySalaryRangeAndAddress(double start, double end, String... address) {
        Query query = new Query();
        query.addCriteria(Criteria.where("employAddress").in(address).and("employSalary").gte(start).lte(end));
        List<Employee> employees = mongoTemplate.find(query, Employee.class);
        return employees;
    }

    @Override
    public String findAndUpdateEmployDataUsingEmployNumber(int employNumber, double newSalary, String newAddress) {
        Query query = new Query();
        query.addCriteria(Criteria.where("employNumber").is(employNumber));
        Update update = new Update();
        update.set("employSalary", newSalary);
        update.set("employAddress", newAddress);
        Employee employModified = mongoTemplate.findAndModify(query, update, Employee.class);
        return employModified==null?"Employ Not Found":"Employ Data Updated Successfully for Employ Number: " + employModified;
    }

    @Override
    public String findAndUpdateEmployDataUsingEmploySalaryRange(double start, double end, String newAddress) {
        Query query = new Query();
        query.addCriteria(Criteria.where("employSalary").gte(start).lte(end));
        Update update = new Update();
        update.set("employAddress", newAddress);
        UpdateResult updateResult = mongoTemplate.updateMulti(query, update, Employee.class);
        return updateResult.getModifiedCount()+" Employ(s) Data Updated Successfully";
    }

    @Override
    public String saveOrUpdateEmployDataUsingEmpNum(int employNumber, double newSalary, String newAddress) {
        Query query = new Query();
        query.addCriteria(Criteria.where("employNumber").is(employNumber));
        Update update = new Update();
        update.set("employSalary", newSalary);
        update.set("employAddress", newAddress);
        update.setOnInsert("employIsVaccinated", false);
        update.setOnInsert("employName","Baba Yaga");
        update.setOnInsert("employNumber",employNumber);
        UpdateResult upsertEmployData = mongoTemplate.upsert(query, update, Employee.class);
        if (upsertEmployData.getModifiedCount()==0) {
            return "No Employ Found with Employ Number: " + employNumber + ". New Employ Created.";
        } else {
            return "Employ Data Updated Successfully for Employ Number: " + employNumber;
        }
    }
}
