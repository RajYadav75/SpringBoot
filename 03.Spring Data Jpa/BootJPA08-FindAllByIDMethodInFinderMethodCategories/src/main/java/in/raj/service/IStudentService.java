package in.raj.service;

import in.raj.entity.Student;

public interface IStudentService {
   public Iterable<Student> findAllStudentById(Iterable<Integer> id);
}
