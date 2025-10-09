package in.raj.service.implemetationClass;

import in.raj.entity.Heroines;
import in.raj.repository.IHeroines;
import in.raj.service.IHeroinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroinesServiceImpl implements IHeroinesService {
    @Autowired
    private IHeroines actoress;
    @Override
    public Heroines addHeroines(Heroines heroines) {
        return actoress.save(heroines);
    }
}
