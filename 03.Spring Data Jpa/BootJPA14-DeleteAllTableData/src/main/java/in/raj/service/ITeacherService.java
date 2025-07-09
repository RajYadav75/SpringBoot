package in.raj.service;

import in.raj.entity.Teacher;

import java.util.List;

public interface ITeacherService {
    public String  addTeacher(Iterable<Teacher> teachers);
    public String deleteAllTeacher();
}
