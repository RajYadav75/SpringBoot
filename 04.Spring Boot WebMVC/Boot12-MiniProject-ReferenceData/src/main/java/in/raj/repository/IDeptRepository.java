package in.raj.repository;

import in.raj.model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IDeptRepository extends JpaRepository<Dept, Integer> {
    @Query("select deptno from Dept")
    public List<Integer> fetchAllDeptNos();
}
