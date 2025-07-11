package in.raj.repo;

import in.raj.entity.Teacher;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ITeacherRepo extends PagingAndSortingRepository<Teacher, Integer> {
}
