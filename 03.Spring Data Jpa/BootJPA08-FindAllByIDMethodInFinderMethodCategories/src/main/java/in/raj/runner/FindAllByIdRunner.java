package in.raj.runner;

import in.raj.entity.Student;
import in.raj.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindAllByIdRunner implements CommandLineRunner {
    @Autowired
    private IStudentService  studentService;
    @Override
    public void run(String... args) throws Exception {
        try{
           studentService.findAllStudentById(List.of(1,5,8,6)).forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
