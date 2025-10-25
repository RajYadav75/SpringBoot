package in.raj.service.impl;

import in.raj.document.Employ;
import in.raj.repository.IEmployRepo;
import in.raj.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployService implements IEmployService {
    @Autowired
    private IEmployRepo employRepo;
    @Override
    public String registerEmploy(Employ employ) {
        String employId = employRepo.save(employ).getEmployId();
        return "Employ is registered successfully! with the id value : " + employId;
    }

    @Override
    public String[] registerEmployees(List<Employ> employs) {
        List<Employ> savedEmploy = employRepo.saveAll(employs);
        String[] idValues = new String[savedEmploy.size()];
        for (int i = 0; i < savedEmploy.size(); ++i) {
            idValues[i] = savedEmploy.get(i).getEmployId();
        }
        return idValues;
    }

    @Override
    public List<Employ> showAllEmploys() {
        return employRepo.findAll();
    }

    @Override
    public Employ findEmployById(String id) {
        Optional<Employ> employOptional = employRepo.findById(id);
        if (employOptional.isPresent()) {
            return employOptional.get();
        }else  {
            throw new IllegalArgumentException("employ not found with id : " + id);
        }
    }

    @Override
    public String updateEmployById(String id, Double newSalary) {
        Optional<Employ> employOptional = employRepo.findById(id);
        if (employOptional.isPresent()) {
            Employ employ = employOptional.get();
            employ.setEmploySalary(newSalary);
            String employId = employRepo.save(employ).getEmployId();
            return "Employ is updated successfully! with the id value : " + employId;
        }else{
            return "employ not found with id : " + id;
        }
    }
}
