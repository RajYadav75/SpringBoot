package in.raj.repo;

import in.raj.entity.Heroines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IHeroineRepo extends JpaRepository<Heroines,Integer> {
//    @Query("select actoress from Heroines as actoress")
//    @Query("from Heroines")
    @Query("from Heroines actoress")
    public List<Heroines> getAllHeroines();

    @Query("from Heroines where fees between ?1 and ?2")
    public List<Heroines> getHeroinesByFeesRange(Integer startFees, Integer endFees);

    @Query("from Heroines where fees between ?1 and ?2")
    public Iterable<Heroines> getHeroinesByFeesRange2(Integer startFees, Integer endFees);


}