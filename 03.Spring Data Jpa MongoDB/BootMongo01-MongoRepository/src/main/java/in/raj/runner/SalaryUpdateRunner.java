package in.raj.runner;

import in.raj.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SalaryUpdateRunner implements CommandLineRunner {
    @Autowired
    private IEmployService iEmployService;
    @Override
    public void run(String... args) throws Exception {
        String updatedSalary = iEmployService.updateEmployById("68fc5ed53eaba3de714f3de6", 7896532.00);
        System.out.println(updatedSalary);
    }
}
