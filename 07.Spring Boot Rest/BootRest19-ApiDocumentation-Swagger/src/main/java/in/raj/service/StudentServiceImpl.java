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

    @Override
    public String updateBudgetById(int id, double hikePercentage) {
        Optional<Student> studentId = repo.findById(id);
        if (studentId.isPresent()) {
            // Get Existing budget of the student
            Student student = studentId.get();
            Double budget = student.getBudget();
            double newBudget = budget + (budget * hikePercentage / 100.0);
            student.setBudget(newBudget);
            repo.save(student);
            return "Student budget is hiked...and the new budget is  :: "+newBudget;
        }
        return "Student not found";
    }

    @Override
    public String removeStudentById(int id) {
        Optional<Student> studentId = repo.findById(id);
        if (studentId.isPresent()) {
            repo.delete(studentId.get());
            return "Student removed successfully with id Number :: "+id;
        }
        return "Student not found";
    }

    @Override
    public String removeStudentByBudgetRange(double start, double end) {
        int count = repo.removeStudentByBudgetRange(start, end);
        return count==0?" Student not found for Deletion":count+" number of  students found and removed successfully";
    }

    @Override
    public String removeStudentByPackageType(String packageType) {
        int msg = repo.removeStudentByPackageType(packageType);
        return msg+" no.of student are removed";
    }
}
