package in.raj.repo;

import in.raj.entity.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface ITeacherRepo extends CrudRepository<Teacher, Integer> {
    Iterable<Integer> id(Integer id);
}
