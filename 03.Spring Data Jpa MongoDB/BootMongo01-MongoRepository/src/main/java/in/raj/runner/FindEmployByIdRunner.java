package in.raj.runner;

import in.raj.document.Employ;
import in.raj.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FindEmployByIdRunner implements CommandLineRunner {
    @Autowired
    private IEmployService iEmployService;
    @Override
    public void run(String... args) throws Exception {
        Employ employById = iEmployService.findEmployById("68fc5ed53eaba3de714f3de6");
        System.out.println(employById);
    }
}
