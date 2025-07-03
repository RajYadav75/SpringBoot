package in.raj.service;

import in.raj.entity.Student;
import in.raj.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IStudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentRepo studentRepo;


    /*@Override
    public Student showStudentById(Integer id) {
        Student student = studentRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid Student ID"));
        return student;
    }*/

    //TODO :- Best Method Version
    @Override
    public Student showStudentById(Integer id) {
        Optional<Student> findStudentbyId = studentRepo.findById(id);
        if (findStudentbyId.isPresent()){
            return findStudentbyId.get();
        }else {
            throw new IllegalArgumentException("<========================Invalid Student Id========================>");
        }
    }
}
