package in.raj.runner;

import in.raj.services.IOneToManyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OneToManyRunner implements CommandLineRunner {

    @Autowired
    private IOneToManyService service;
    @Override
    public void run(String... args) throws Exception {
        //TODO:- Save the data using Parent
        //service.saveDataUsingCustomer();
        //TODO:- Save the data using Child
        //service.saveDataUsingPhoneNumber();
        //TODO:- Load data using Parent
        service.getDataUsingCustomer();
        service.getDataUsingPhoneNumber();
        //TODO:- Delete Data
        service.deleteDataUsingCustomer(102);
    }
}
