package in.raj.rest;

import in.raj.model.Company;
import in.raj.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("Complex-JsonData")
public class RajRestController {
    /*
     {
    "cno": 1001,
    "cname": "Raj",
    "cadd": "Uttar Pradesh",
    "billAmt": 90000.0,
    "nickNames": [
        "raj",
        "maharaj",
        "king"
    ],
    "friends": [
        "raja",
        "ravi",
        "suresh"
    ],
    "phoneNumbers": [
        8888888,
        9999999,
        777777
    ],
    "idDetails": {
        "voterId": 534555,
        "passport": 545555,
        "aadhar": 454545
    },
    "company": {
        "id": 1234,
        "name": "HCL",
        "addrs": "hyd",
        "size": 100
    },
    "dob": "1991-10-02T06:07:10",
    "isIndian": true
}*/
    @GetMapping("report")
    public ResponseEntity<Customer> getCustomer() {
        Customer customer = new Customer();
        customer.setCno(1001);
        customer.setCname("Raj");
        customer.setCadd("Uttar Pradesh");
        customer.setBillAmt(90000.0f);
        customer.setNickNames(new String[] {"raj","maharaj","king"});
        customer.setFriends(List.of("raja","ravi","suresh"));
        customer.setPhoneNumbers(Set.of(9999999L,8888888L,777777L));
        customer.setIdDetails(Map.of("aadhar", 454545, "passport", 545555, "voterId", 534555));
        customer.setDob(LocalDateTime.of(1991, 10,2,6,7,10));
        Company company=new Company(1234,"HCL","hyd",100);
        customer.setCompany(company);
        customer.setIsIndian(true);
        //return ResponseEntity object
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }
}
