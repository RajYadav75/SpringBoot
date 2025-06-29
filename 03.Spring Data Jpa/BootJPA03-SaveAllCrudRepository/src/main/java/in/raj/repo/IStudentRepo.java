package in.raj.repo;

import in.raj.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepo extends CrudRepository<Student,Integer> {
}
