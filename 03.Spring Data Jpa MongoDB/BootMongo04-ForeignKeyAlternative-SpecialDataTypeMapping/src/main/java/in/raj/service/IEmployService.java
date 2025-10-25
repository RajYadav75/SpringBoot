package in.raj.service;

import in.raj.document.Employ;

import java.util.List;

public interface IEmployService {
    public String registerEmploy(Employ employ);
    public List<Employ> getAllEmployees();
}
