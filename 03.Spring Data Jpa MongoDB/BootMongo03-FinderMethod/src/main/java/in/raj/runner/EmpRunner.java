package in.raj.runner;

import in.raj.document.Employee;
import in.raj.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class EmpRunner implements CommandLineRunner {
    @Autowired
    private IEmployService employService;
    @Override
    public void run(String... args) throws Exception {
        employService.findByEmploySalaryBetween(10000.0, 1000000.0).forEach(System.out::println);
        System.out.println("===============================================================");
        employService.findByEmployNameIn("Raj Yadav","Ankita Tiwari").forEach(System.out::println);
    }
}
