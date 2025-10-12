package in.raj.repo;

import in.raj.entity.Heroines;
import in.raj.view.IResultView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IHeroineRepo extends JpaRepository<Heroines,Integer> {
    //TODO:- Scaler Operation
    public List<IResultView> findByFees(Double fees);
}