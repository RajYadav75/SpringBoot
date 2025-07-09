package in.raj.service;

import in.raj.entity.Teacher;
import in.raj.repo.ITeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ITeacherServiceImpl implements ITeacherService {
    @Autowired
    private ITeacherRepo teacherRepo;
    @Override
    public String removeTeachersByTheirIds(List<Integer> ids) {
        List<Teacher> teacherList = (List<Teacher>) teacherRepo.findAllById(ids);
        if (teacherList.size() == ids.size()) {
            teacherRepo.deleteAllById(ids);
            return teacherList+" Teachers have been deleted";
        }
        return "Some of given id value record are not found in the database table";
    }
}
