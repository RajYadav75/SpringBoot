package in.raj.repo;

import in.raj.entity.Heroines;
import in.raj.view.IResultView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IHeroineRepo extends JpaRepository<Heroines,Integer> {
    //TODO:- Scaler Operation
    public <T extends IResultView> List<T> findByNameIn(List<String> names, Class<T> clazz);
    public Heroines findById(int id);
}