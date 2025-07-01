package in.raj.runner;

import in.raj.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CountRunner implements CommandLineRunner {
    @Autowired
    private IStudentService  studentService;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Count of Records in Database :: "+studentService.fetchStudentCount());
    }
}
