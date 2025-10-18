package in.raj.repo;

import in.raj.entity.Heroines;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IHeroineRepo extends JpaRepository<Heroines, Integer> {

}