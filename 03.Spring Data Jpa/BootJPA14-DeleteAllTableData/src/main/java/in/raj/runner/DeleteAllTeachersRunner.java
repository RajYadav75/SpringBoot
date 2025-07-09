package in.raj.runner;

import in.raj.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class DeleteAllTeachersRunner   implements CommandLineRunner {
    @Autowired
    private ITeacherService teacherService;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Delete All Teachers "+teacherService.deleteAllTeacher());
    }
}
