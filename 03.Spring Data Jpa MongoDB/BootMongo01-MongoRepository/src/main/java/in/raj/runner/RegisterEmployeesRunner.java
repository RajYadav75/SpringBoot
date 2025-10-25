package in.raj.runner;

import in.raj.document.Employ;
import in.raj.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RegisterEmployeesRunner implements CommandLineRunner {
    @Autowired
    private IEmployService iEmployService;
    @Override
    public void run(String... args) throws Exception {
        Employ employ = new Employ();
        employ.setEmployNumber(2);
        employ.setIsEmployVaccinated(false);
        employ.setEmployName("Baba Yaga");
        employ.setEmployAddress("Continental");
        employ.setEmploySalary(89563.00);
        Employ employ1 = new Employ(3,"Ankita Tiwari","Harigana",45000.00,true);
        String[] registeredEmployees = iEmployService.registerEmployees(List.of(employ, employ1));
        System.out.println("Successfully registered employees "+ Arrays.toString(registeredEmployees));
    }
}
