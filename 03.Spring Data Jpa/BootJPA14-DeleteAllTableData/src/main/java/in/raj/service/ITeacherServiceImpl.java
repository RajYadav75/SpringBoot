package in.raj.service;

import in.raj.entity.Teacher;
import in.raj.repo.ITeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ITeacherServiceImpl implements ITeacherService {
    @Autowired
    private ITeacherRepo teacherRepo;
    @Override
    public String addTeacher(Iterable<Teacher> teachers) {
        if (teachers != null){
            Iterable<Teacher> savedTeacher = teacherRepo.saveAll(teachers);
            int size = ((Collection<?>) savedTeacher).size();
            List<Integer> ids = ((Collection<?>) savedTeacher).stream()
                    .map(
                            teacher -> ((Teacher) teacher).getId()
                    ).collect(Collectors.toList());
            return size + "no of Teacher are saved with id values :: "+ids.toString();
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String deleteAllTeacher() {
        long teacherCounted = teacherRepo.count();
        if (teacherCounted > 0) {
            teacherRepo.deleteAll();
            return teacherCounted + " Teacher deleted successfully";
        }
        return  "No record found";
    }
}
