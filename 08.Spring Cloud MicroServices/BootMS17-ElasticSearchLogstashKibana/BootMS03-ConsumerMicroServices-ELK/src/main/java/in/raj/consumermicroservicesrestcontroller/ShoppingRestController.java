package in.raj.consumermicroservicesrestcontroller;

import in.raj.clientcommunications.BillingApiConsumingClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
@RestController
@RequestMapping("/Shopping-Api")
@Slf4j
public class ShoppingRestController {


    @Autowired
    private BillingApiConsumingClient clientComp;

    @GetMapping("/info")
    public ResponseEntity<String> shoppingInfo(){
        log.info("start of  shoppingInfo() -- ShoppingMs");
        // use the provider MS
        String billingInfo=clientComp.getBillingInfo();
        log.info("Dest MS is invoked through  client  comp");
        // get shopping MS result
        String  shoppingInfo="The Shopping BillAmount is::"+new Random().nextInt(20000);
        // combine the final result
        String finalResult=shoppingInfo+"..."+billingInfo;
        log.info("Final result is prepared and  send ");
        return  new ResponseEntity<String>(finalResult, HttpStatus.OK);
    }
}
