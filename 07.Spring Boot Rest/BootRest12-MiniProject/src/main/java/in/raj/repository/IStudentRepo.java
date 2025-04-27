package in.raj.repository;

import in.raj.modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IStudentRepo extends JpaRepository<Student, Integer> {
    //TODO:- Getting Students information using Name4
    @Query("from Student where name=:name")
    public List<Student> findByName(@Param("name") String name);
}
