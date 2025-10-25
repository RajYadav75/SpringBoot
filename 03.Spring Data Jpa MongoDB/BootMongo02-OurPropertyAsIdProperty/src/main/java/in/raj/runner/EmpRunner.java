package in.raj.runner;

import in.raj.document.Employee;
import in.raj.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class EmpRunner implements CommandLineRunner {
    @Autowired
    private IEmployService employService;
    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee(new Random().nextInt(100000), "Ankita Tiwari", "Harigana", 900020.00, true);
        String registerEmploy = employService.registerEmploy(employee);
        System.out.println(registerEmploy);
        System.out.println("========================================");
        employService.showAllEmploys().forEach(System.out::println);
    }
}
