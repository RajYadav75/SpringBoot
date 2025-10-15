package in.raj.repo;

import in.raj.entity.Heroines;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface IHeroineRepo extends JpaRepository<Heroines, Integer> {
    @Query(value = "insert into JPA_HEROINES_TAB(ID,NAME,FEES,DESCRIPTION) values (OneIn.NEXTVAL,:name,:fees,:description)",nativeQuery = true)
    @Modifying
    @Transactional
    public int insertHeroine(String name,Double fees,String description);

    @Query(value = "create table BABA(Col1 number(10),Col2 number(10))",nativeQuery = true)
    @Modifying
    @Transactional
    public int createBabaTable();
}