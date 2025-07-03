package in.raj.runner;

import in.raj.entity.Student;
import in.raj.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindByIdRunner implements CommandLineRunner {
    @Autowired
    private IStudentService  studentService;
    @Override
    public void run(String... args) throws Exception {
        try{
            Student student = studentService.showStudentById(2);
            System.out.println(student);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
