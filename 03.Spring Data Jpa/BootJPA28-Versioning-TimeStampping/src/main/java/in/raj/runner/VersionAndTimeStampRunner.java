package in.raj.runner;

import in.raj.entity.BankAccount;
import in.raj.service.IBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class VersionAndTimeStampRunner implements CommandLineRunner {
    @Autowired
    private IBankService bankService;
    @Override
    public void run(String... args) throws Exception {
        //TODO:- Save the Object
        /*try {
            BankAccount bankAccount = new BankAccount("Raj Yadav",580000.00,81115605569L);
            String userRegistered = bankService.registerUser(bankAccount);
            System.out.println("User registered with account number " + userRegistered);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        //TODO:- Load and Update the Object
        try {
            String updateMobileNumber = bankService.updateMobileNumber(1000000L, 6388141558L);
            System.out.println("Updated mobile number " + updateMobileNumber);
            bankService.getAllBankAccounts().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
