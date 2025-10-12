package in.raj.repo;

import in.raj.entity.Heroines;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IHeroineRepo extends JpaRepository<Heroines,Integer> {
    List<Heroines> findBynameEquals(String heroineName);
    List<Heroines> findByNameIs(String heroineName);
    List<Heroines> getByName(String heroineName);
    List<Heroines> findByFeesBetween(Double fees1, Double fees2);
    List<Heroines> findByNameStartsWith(String startCharacter);
    List<Heroines> findByNameEndsWith(String endCharacter);
    List<Heroines> findByNameContaining(String searchString);
    List<Heroines> findByNameContainingIgnoreCase(String searchString);
    List<Heroines> findByNameLikeIgnoreCase(String searchString);
    List<Heroines> findByFeesGreaterThanEqualAndFeesLessThanEqual(Double startSalary, Double endSalary);
    List<Heroines> findByNameInIgnoreCaseOrNameContainingIgnoreCase(List<String> names,String searchString);
}
