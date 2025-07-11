package in.raj.service;

import in.raj.entity.Teacher;
import in.raj.repo.ITeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ITeacherServiceImpl implements ITeacherService {
    @Autowired
    private ITeacherRepo teacherRepo;
    @Override
    public Iterable<Teacher> showTeacherBySorting(boolean asc, String... props) {
        //TODO:- Prepare The Sorting Object
        Sort sort = Sort.by(asc ? Sort.Direction.ASC : Sort.Direction.DESC, props);
        // TODO:- Use Repo
        return teacherRepo.findAll(sort);
    }
}
