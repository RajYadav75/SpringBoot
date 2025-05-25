package in.raj.providermicroservices;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Billing-Api")
@Slf4j
public class BillingRestController {

    @Value("${server.port}")
    private Integer portNo;
    @Value("${eureka.instance.instance-id}")
    private String instanceId;


    @GetMapping("/billing")
    public ResponseEntity<String> showBillingInfo() {
        log.info("Billing MicroService:: showBillingInfo method");
        return new ResponseEntity<>("we  accept UPI Payments,DebitCards ,Credit Card and etc.. from the instance-->"+instanceId+"...."+portNo, HttpStatus.OK);
    }
}
