package in.raj.service;

import in.raj.error.DostNotFoundException;
import in.raj.model.Dost;

import java.util.List;

public interface IDostService {
    public String registerDost(Dost dost);
    public List<Dost> showAllDost();
    public Dost showDostById(int id) throws DostNotFoundException;
    public String updateDost(Dost dost);
    public String deleteDost(int id);
}
