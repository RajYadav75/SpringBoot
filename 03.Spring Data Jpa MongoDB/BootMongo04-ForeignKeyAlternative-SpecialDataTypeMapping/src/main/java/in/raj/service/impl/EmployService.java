package in.raj.service.impl;

import in.raj.document.Employ;
import in.raj.repository.IEmployRepo;
import in.raj.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployService implements IEmployService {
    @Autowired
    private IEmployRepo employRepo;

    @Override
    public String registerEmploy(Employ employ) {
        String employId = employRepo.save(employ).getEmployId();
        return "Employ is saving successfully! with id "+employId+" name is "+employ.getEmployName();
    }

    @Override
    public List<Employ> getAllEmployees() {
        return employRepo.findAll();
    }
}
