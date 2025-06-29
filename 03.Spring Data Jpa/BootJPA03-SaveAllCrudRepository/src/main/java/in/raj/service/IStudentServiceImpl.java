package in.raj.service;

import in.raj.entity.Student;
import in.raj.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IStudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentRepo studentRepo;

    // TODO: This is modern day code
    /*@Override
    public String registerGroupOfStudents(Iterable<Student> students) {
        if (students != null){
            Iterable<Student> savedStudent = studentRepo.saveAll(students);
            int size = ((Collection<?>) savedStudent).size();
            List<Integer> ids = (List<Integer>)((Collection)savedStudent).stream()
                    .map(s->((Student)s).getId()).collect(Collectors.toList());
            return size + "no. of Student are saved with id values :: "+ids.toString();
        }
        else {
            throw new IllegalArgumentException("Invalid Student info");
        }
    }*/
//  TODO: Old Fashion Code
    @Override
    public String registerGroupOfStudents(Iterable<Student> students) {
        if (students != null){
            Iterable<Student> savedStudent = studentRepo.saveAll(students);
            int size = ((Collection) savedStudent).size();
            List<Integer> ids = new ArrayList<>();
            savedStudent.forEach(
                    student -> {
                        ids.add(student.getId());
                    }
            );
            return size + "no. of Student are saved with id values :: "+ids.toString();
        }else {
          throw  new IllegalArgumentException("Invalid Student Info");
        }
    }
}
