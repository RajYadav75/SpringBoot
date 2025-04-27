package in.raj.service;

import in.raj.modal.Student;

import java.util.List;

public interface IStudentService {
    public String addStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentById(Integer id);
    public String updateStudent(Student student);
    public List<Student> getStudentsByName(String studentName);
}
