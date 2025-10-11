package in.raj.service.implemetationClass;

import in.raj.entity.Heroines;
import in.raj.repository.IHeroines;
import in.raj.service.IHeroinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HeroinesServiceImpl implements IHeroinesService {
    @Autowired
    private IHeroines repo;
    @Override
    public Heroines addHeroines(Heroines heroines) {
        return repo.save(heroines);
    }

    @Override
    @Transactional
    public Heroines getHeroinesById(int id) {
//        Heroines byId = repo.getById(id);  Deprecated
//        Heroines one = repo.getOne(id); Deprecated
        return repo.getReferenceById(id);//Latest
    }

    @Override
    public List<Heroines> showHeroinesByExampleData(Heroines atrs, boolean ascOrder, String ...properties) {
        Example<Heroines> heroinesExample = Example.of(atrs);
        Sort sort = Sort.by(ascOrder? Sort.Direction.ASC: Sort.Direction.DESC,properties);
        List<Heroines> all = repo.findAll(heroinesExample, sort);
        return all;
    }

    @Override
    public String deleteHeroinesById(List<Integer> ids) {
        List<Heroines> findAllbyId = repo.findAllById(ids);
        if (findAllbyId.size()!=0) {
            repo.deleteAllByIdInBatch(ids);
            return findAllbyId.size() +" number of record are deleted";
        }else{
            return "No record found for Deletion";
        }
    }

    @Override
    public String groupHeroinesRegistration(List<Heroines> heroines) {
        List<Heroines> heroinesList = repo.saveAllAndFlush(heroines);
        return heroinesList.size() +" numbers of  Heroines have been Saved";
    }
}
