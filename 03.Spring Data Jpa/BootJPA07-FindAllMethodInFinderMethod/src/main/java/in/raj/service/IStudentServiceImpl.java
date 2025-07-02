package in.raj.service;

import in.raj.entity.Student;
import in.raj.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IStudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentRepo studentRepo;

    @Override
    public Iterable<Student> findAllStudents() {
        return studentRepo.findAll();
    }
}
