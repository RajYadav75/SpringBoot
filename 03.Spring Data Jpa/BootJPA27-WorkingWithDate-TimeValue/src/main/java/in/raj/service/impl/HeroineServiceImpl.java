package in.raj.service.impl;

import in.raj.entity.Heroines;
import in.raj.repo.IHeroineRepo;
import in.raj.service.IHeroinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroineServiceImpl implements IHeroinesService {
    @Autowired
    private IHeroineRepo heroineRepo;
    @Override
    public String registerHeroines(Heroines heroines) {
        Integer idValue = heroineRepo.save(heroines).getId();
        return "Heroine had been saved with the id value of " + idValue;
    }

    @Override
    public List<Heroines> getAllHeroines() {
        return heroineRepo.findAll();
    }
}
