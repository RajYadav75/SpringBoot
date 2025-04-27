package in.raj.service;

import in.raj.modal.Student;
import in.raj.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public  class StudentServiceImpl implements IStudentService{


    @Autowired
    private IStudentRepo repo;
    @Override
    public String addStudent(Student student) {
        Integer id = repo.save(student).getId();
        return "Student added successfully with id Number :: "+id;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> allStudent = repo.findAll();
        return allStudent;
    }

    @Override
    public Student getStudentById(Integer id) {
        return repo.findById(id).get();
    }

    @Override
    public String updateStudent(Student student) {
        Optional<Student> studentById = repo.findById(student.getId());
        if (studentById.isPresent()) {
            repo.save(student);
            return "Student updated successfully with id Number :: "+student.getId();
        }
        return "Student not found";
    }

    @Override
    public List<Student> getStudentsByName(String studentName) {
        return repo.findByName(studentName);
    }
}
