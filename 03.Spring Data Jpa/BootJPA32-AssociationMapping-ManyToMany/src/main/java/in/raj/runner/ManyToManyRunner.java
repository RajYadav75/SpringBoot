package in.raj.runner;

import in.raj.service.IManyToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ManyToManyRunner implements CommandLineRunner {
    @Autowired
    private IManyToMany service;
    @Override
    public void run(String... args) throws Exception {
//        service.saveDataUsingDoctor();
//        service.saveDataUsingPatient();
        service.getDataUsingDoctor();
        System.out.println("===================");
        service.getDataUsingPatient();
    }
}
