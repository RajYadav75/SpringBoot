package in.raj.repo;

import in.raj.entity.Heroines;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
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

    @Query("select id,name,fees from Heroines where name in(:name1,:name2)")
//TODO:- scalar -projection (selecting specific multiple col values)
    public List<Object[]> getHeroinesData(String name1, String name2);

    @Query("select name,description from Heroines where name like :initChar")
//TODO:- scalar -projection (selecting specific single col values)
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

    //    TODO:- Non Select Operation JPQL QUERY
    @Query("update Heroines set fees=fees+(fees*:percentage/100.00) where name in(:name1,:name2)")
    @Transactional
    @Modifying
    /*TODO:-
    *   | Annotation       | काम                                   | अगर न लगाएँ तो                             |
        | ---------------- | ------------------------------------- | ------------------------------------------ |
        | `@Modifying`     | बताता है कि यह query डाटा को बदलती है | Spring इसे SELECT मानेगा और Error देगा     |
        | `@Transactional` | सुनिश्चित करता है कि बदलाव commit हों | Update होगा पर Database में Save नहीं होगा |
    * */

    /*TODO:-
    *  🧩 1️⃣ अगर @Modifying नहीं लगाएँ:
        अगर आप @Modifying नहीं लगाते हैं,
        तो Spring Data JPA मानेगा कि यह SELECT query है।
        👉 नतीजा:
        यह update करने की कोशिश नहीं करेगा।
        रनटाइम पर Exception देगा जैसे:
        org.springframework.dao.InvalidDataAccessApiUsageException:
        Modifying queries can only use void or int/Integer as return type!
        या
        QueryExecutionRequestException: Update queries cannot be typed
        मतलब — Spring बोलेगा, “तुम update करना चाहते हो, लेकिन बताया नहीं कि ये modifying query है।”*/
    /*TODO:-
    *  🧩 2️⃣ अगर @Transactional नहीं लगाएँ:
        Update, Delete, या Insert queries के लिए transaction ज़रूरी होता है।
        अगर आप @Transactional नहीं लगाएँगे, तो कुछ डेटाबेस में change commit नहीं होगा।
        यानी query चलेगी पर डेटा update नहीं होगा।*/
    public int updateHeroinesFeesByName(double percentage, String name1, String name2);

    @Query("delete from Heroines where id between :start and :end")
    @Transactional
    @Modifying
    public int deleteHeroinesBetweenId(Integer start, Integer end);
}