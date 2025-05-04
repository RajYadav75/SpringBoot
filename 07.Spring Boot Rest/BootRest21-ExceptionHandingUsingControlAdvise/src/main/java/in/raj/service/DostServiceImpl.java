package in.raj.service;

import in.raj.error.DostNotFoundException;
import in.raj.model.Dost;
import in.raj.repo.DostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DostServiceImpl implements IDostService{
    @Autowired
    private DostRepository dostRepo;
    @Override
    public String registerDost(Dost dost) {
        Integer dostId = dostRepo.save(dost).getId();
        return "Dost " + dostId + " registered";
    }

    @Override
    public List<Dost> showAllDost() {
        return dostRepo.findAll();
    }

    @Override
    public Dost showDostById(int id) throws DostNotFoundException {
        return dostRepo.findById(id).orElseThrow(()-> new DostNotFoundException(id+"Dost not found"));
    }

    @Override
    public String updateDost(Dost dost) {
        Optional<Dost> dostRepoById = dostRepo.findById(dost.getId());
        if (dostRepoById.isPresent()){
            dostRepo.save(dost);
            return "Dost " + dost.getId() + " updated";
        }
        return "Dost " + dost.getId() + " not found";
    }

    @Override
    public String deleteDost(int id) {
        Optional<Dost> dostRepoById = dostRepo.findById(id);
        if (dostRepoById.isPresent()){
            dostRepo.deleteById(id);
            return "Dost " + id + " deleted";
        }
        return "Dost " + id + " not found";
    }
}
