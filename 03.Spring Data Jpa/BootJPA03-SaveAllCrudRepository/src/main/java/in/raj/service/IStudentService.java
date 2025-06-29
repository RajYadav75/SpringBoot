package in.raj.service;

import in.raj.entity.Student;

public interface IStudentService {
    public String registerGroupOfStudents(Iterable<Student> students);
}
