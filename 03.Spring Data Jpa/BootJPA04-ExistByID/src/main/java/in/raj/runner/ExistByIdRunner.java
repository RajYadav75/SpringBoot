package in.raj.runner;

import in.raj.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ExistByIdRunner implements CommandLineRunner {
    @Autowired
    private IStudentService  studentService;
    @Override
    public void run(String... args) throws Exception {
        boolean studentAvailable = studentService.isStudentAvailable(1);
        if(studentAvailable){
            System.out.println("Student is available");
        }else {
            System.out.println("Student is not available");
        }
    }
}
