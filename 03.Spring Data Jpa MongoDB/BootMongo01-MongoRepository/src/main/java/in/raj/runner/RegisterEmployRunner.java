package in.raj.runner;

import in.raj.document.Employ;
import in.raj.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RegisterEmployRunner implements CommandLineRunner {
    @Autowired
    private IEmployService iEmployService;
    @Override
    public void run(String... args) throws Exception {
        try {
            Employ employ = new Employ(1,"Raj Yadav","Kanapar",45000.00,true);
            String registerEmploy = iEmployService.registerEmploy(employ);
            System.out.println(registerEmploy);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
