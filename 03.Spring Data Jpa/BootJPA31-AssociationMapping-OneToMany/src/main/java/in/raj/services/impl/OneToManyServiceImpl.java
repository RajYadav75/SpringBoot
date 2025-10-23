package in.raj.services.impl;

import in.raj.entity.Customer;
import in.raj.entity.PhoneNumber;
import in.raj.repository.ICustomerRepo;
import in.raj.repository.IPhoneNumberRepo;
import in.raj.services.IOneToManyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class OneToManyServiceImpl implements IOneToManyService {
    @Autowired
    private ICustomerRepo customerRepo;
    @Autowired
    private IPhoneNumberRepo phoneNumberRepo;
    @Override
    public void saveDataUsingCustomer() {
        //TODO:- Prepare Parent Data
        Customer customer = new Customer("Raj Yadav","GKP");
        //TODO:- Child Object
        PhoneNumber phoneNumber1 = new PhoneNumber(81526423125L,"office","airtel");
        PhoneNumber phoneNumber2 = new PhoneNumber(63985471255L,"residence","jio");
        //TODO:- Link Child TO Parent and Vice-Versa
        Set<PhoneNumber>  phoneNumbers = new HashSet<>();
        phoneNumbers.add(phoneNumber1);
        phoneNumbers.add(phoneNumber2);
        //TODO:- Parent is Linked with child
        phoneNumber1.setCustomer(customer);
        phoneNumber2.setCustomer(customer);
        //TODO:- Child are Linked with parent
        customer.setPhones(phoneNumbers);
        //TODO:- Save Data using parent Object
        Integer idValue = customerRepo.save(customer).getCid();
        System.out.println("Customer Object and their objects are saved with id value :: "+idValue);
    }

    @Override
    public void saveDataUsingPhoneNumber() {
        //TODO:- Prepare Parent Data
        Customer customer = new Customer("Baba Yaga","UP");
        //TODO:- Child Object
        PhoneNumber phoneNumber1 = new PhoneNumber(68547521544L,"office","vi");
        PhoneNumber phoneNumber2 = new PhoneNumber(78964425136L,"residence","jio");
        //TODO:- Link Child TO Parent and Vice-Versa
        Set<PhoneNumber>  phoneNumbers = new HashSet<>();
        phoneNumbers.add(phoneNumber1);
        phoneNumbers.add(phoneNumber2);
        //TODO:- Parent is Linked with child
        phoneNumber1.setCustomer(customer);
        phoneNumber2.setCustomer(customer);
        //TODO:- Child are Linked with parent
        customer.setPhones(phoneNumbers);
        //TODO:- Save Data using parent Object
        Integer regNumber1 = phoneNumberRepo.save(phoneNumber1).getRegNumber();
        Integer regNumber2 = phoneNumberRepo.save(phoneNumber2).getRegNumber();
        System.out.println("Phone Number Object and their associate parent objects are saved with id value :: "+regNumber1+"   "+regNumber2);
    }

    @Override
    public void getDataUsingCustomer() {
        List<Customer> all = customerRepo.findAll();
        all.forEach(cust -> {
            System.out.println("Parent :: "+cust);
            Set<PhoneNumber> phones = cust.getPhones();
            phones.forEach(phone -> {
                System.out.println("Child -> Phone Number :: "+phone);
            });
        });
    }

    @Override
    public void getDataUsingPhoneNumber() {
        List<PhoneNumber> phoneNumbers = phoneNumberRepo.findAll();
        phoneNumbers.forEach(phone -> {
            System.out.println("Child -> Phone Number :: "+phone);
            //TODO:- Get Parent
            Customer customer = phone.getCustomer();
            System.out.println("Parent -> Customer :: "+customer);
            System.out.println("-------------------------------------------");
        });
    }

    @Override
    public void deleteDataUsingCustomer(int id) {
        Optional<Customer> byId = customerRepo.findById(id);
        if (byId.isPresent()) {
            Customer customer = byId.get();
            customerRepo.delete(customer);
            System.out.println("Parent and childs are deleted ");
        }else{
            System.out.println("Parent not found");
        }
    }
}
