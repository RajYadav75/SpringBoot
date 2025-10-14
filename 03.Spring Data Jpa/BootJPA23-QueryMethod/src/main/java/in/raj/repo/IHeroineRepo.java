package in.raj.repo;

import in.raj.entity.Heroines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IHeroineRepo extends JpaRepository<Heroines, Integer> {
    //    @Query("select actoress from Heroines as actoress")
//    @Query("from Heroines")
    @Query("from Heroines actoress")
    public List<Heroines> getAllHeroines();
    /*@Query(" from Heroines where fees between :start and :end ")
	public Iterable<Heroines>  getHeroinesByFeesAmountRange(@Param("start") float startAmount,@Param("end") float endAmount);*/

    //@Query(" from Heroines where fees between :startFees and :endFees ")
    //@Query(" from Heroines as actress where actress.fees between :startFees and :endFees ")
    @Query("from Heroines where fees between ?1 and ?2")
    public Iterable<Heroines> getHeroinesByFeesRange1(Integer startFees, Integer endFees);

    @Query("from Heroines where fees between ?1 and ?2")
    public List<Heroines> getHeroinesByFeesRange(Integer startFees, Integer endFees);

    @Query("from Heroines where fees between ?1 and ?2")
    public Iterable<Heroines> getHeroinesByFeesRange2(Integer startFees, Integer endFees);

    @Query("select id,name,fees from Heroines where name in(:name1,:name2)")//TODO:- scalar -projection (selecting specific multiple col values)
    public List<Object[]> getHeroinesData(String name1, String name2);

    @Query("select name,description from Heroines where name like :initChar")//TODO:- scalar -projection (selecting specific single col values)
    public List<String> getHeroinesNamesUsingFchar(String initChar);

    @Query("from Heroines where name=:name")
    public Heroines getHeroinesDescription(String name);

    @Query("select name,fees from Heroines where  name=:name")
    public Object getHeroinesDataUsingName(String name);

    @Query("select name from Heroines  where fees=:fees")
    public String fetchHeroinesNameUsingFees(Integer fees);

    @Query("select count(distinct fees) from Heroines ")
    public int fetchAllHeroinesCountUsingFees();

    @Query("select count(*), max(fees),min(fees),avg(fees),sum(fees) from Heroines ")
    public Object fetchHeroinesAggregateData();

}