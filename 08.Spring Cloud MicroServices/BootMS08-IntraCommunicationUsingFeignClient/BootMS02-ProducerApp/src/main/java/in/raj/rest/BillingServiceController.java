package in.raj.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Billing-Api")
public class BillingServiceController {

    @Value("${server.port}")
    private int port;

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping("/billing")
    public ResponseEntity<String> getBillingInfo() {
        return new ResponseEntity<>("We accept card Payment, UPI payment, NetBanking Payment, COD-->PORT::"+port+"----InstanceID"+instanceId, HttpStatus.OK);
    }
}

