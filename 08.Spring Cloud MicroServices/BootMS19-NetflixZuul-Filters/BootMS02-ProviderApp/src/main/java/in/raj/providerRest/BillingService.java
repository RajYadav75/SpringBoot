package in.raj.providerRest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Billing-Api")
public class BillingService {
    @Value("${server.port}")
    private int port;
    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping("/billing")
    public  ResponseEntity<String>   showBillingInfo(){
        return  new ResponseEntity<String>("we  accept UPI Payments,DebitCards ,Credit Card and etc.. from the instance-->"+instanceId+"...."+port,
                HttpStatus.OK);

    }
}
