package in.raj.rest;

import in.raj.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Customer-Api")
@RestController
public class CustomerOperationsController {

    @PostMapping("/register")
    public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer) {
        System.out.println(customer);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
    /*
    * <Customer>
    <cno>101</cno>
    <cname>John Doe</cname>
    <cadd>456 Elm St, Springfield</cadd>
    <compniesList>
        <Company>
            <id>1</id>
            <name>Tech Innovators</name>
            <addrs>Silicon Valley, CA</addrs>
            <size>500</size>
        </Company>
        <Company>
            <id>2</id>
            <name>Global Solutions</name>
            <addrs>London, UK</addrs>
            <size>1200</size>
        </Company>
    </compniesList>
    <familyIds>
        <member>
            <key>spouse</key>
            <value>78965</value>
        </member>
        <member>
            <key>child</key>
            <value>45678</value>
        </member>
    </familyIds>
</Customer>*/
}
