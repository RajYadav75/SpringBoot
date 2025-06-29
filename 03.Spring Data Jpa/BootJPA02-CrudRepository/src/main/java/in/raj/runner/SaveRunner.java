package in.raj.runner;

import in.raj.entity.Customer;
import in.raj.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SaveRunner implements CommandLineRunner {
    @Autowired
    private ICustomerService customerService;

    @Override
    public void run(String... args) throws Exception {
        /*Customer customer = new Customer();
        customer.setName("Raj Yadav");
        customer.setAddress("Kanapar Bansgaon Gorakhpur");
        customer.setBillAmt(2000.00);*/
        /*Customer customer1 = new Customer();
        customer1.setName("Deepak Kumar");
        customer1.setAddress("Kanaicha Bansgaon Gorakhpur");
        customer1.setBillAmt(2000.00);*/
        /*Customer customer2 = new Customer();
        customer2.setName("Ankita Tiwari");
        customer2.setAddress("Harigana Bansgaon Gorakhpur");
        customer2.setBillAmt(2000.00);*/
        /*Customer customer3 = new Customer();
        customer3.setName("Ambrikesh Gour");
        customer3.setAddress("Kanapar Bansgaon Gorakhpur");
        customer3.setBillAmt(2000.00);*/
        Customer customer4 = new Customer();
        customer4.setName("Baba Yaga");
        customer4.setAddress("Continental Bansgaon Gorakhpur");
        customer4.setBillAmt(2000.00);

        String resultMsg = customerService.registerCustomer(customer4);
        System.out.println(resultMsg);
    }
}
