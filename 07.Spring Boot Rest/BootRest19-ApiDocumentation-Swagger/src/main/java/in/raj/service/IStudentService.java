package in.raj.service;

import in.raj.modal.Student;

import java.util.List;

public interface IStudentService {
    public String addStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentById(Integer id);
    public String updateStudent(Student student);
    public List<Student> getStudentsByName(String studentName);
    public String updateBudgetById(int id,double hikePercentage);
    public String removeStudentById(int id);
    public String removeStudentByBudgetRange(double start,double end);
    public String removeStudentByPackageType(String packageType);
}
