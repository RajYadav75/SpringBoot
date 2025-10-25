package in.raj.runner;

import in.raj.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ShowAllEmployRunner implements CommandLineRunner {
    @Autowired
    private IEmployService iEmployService;
    @Override
    public void run(String... args) throws Exception {
        iEmployService.showAllEmploys().forEach(System.out::println);
    }
}
