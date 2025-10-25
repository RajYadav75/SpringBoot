package in.raj.service;

import in.raj.document.Employ;

import java.util.List;

public interface IEmployService {
    public String registerEmploy(Employ employ);
    public String[] registerEmployees(List<Employ> employs);
    public List<Employ> showAllEmploys();
    public Employ findEmployById(String id);
    public String updateEmployById(String id, Double newSalary);
}
