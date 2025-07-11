package in.raj.service;

import in.raj.entity.Teacher;

public interface ITeacherService {
    public Iterable<Teacher> showTeacherBySorting(boolean asc,String ...props);
}
