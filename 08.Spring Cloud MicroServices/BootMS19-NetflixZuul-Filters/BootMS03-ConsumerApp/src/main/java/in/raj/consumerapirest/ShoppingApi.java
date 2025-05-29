package in.raj.consumerapirest;

import in.raj.providerconfiguration.IBillingSeriviceOperationsConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/Shopping-Api")
public class ShoppingApi {
    @Autowired
    private IBillingSeriviceOperationsConsumerClient client;

    @Value("${server.port}")
    private int port;

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping("/info")
    public ResponseEntity<String> shoppingInfo(){
        System.out.println("proxy class name::"+client.getClass());
        // use the provider MS
        String billingInfo=client.billing().getBody();

        // get shopping MS result
        String  shoppingInfo="The Shopping BillAmount is::"+new Random().nextInt(20000)+" instanced id::"+instanceId+"...port::"+port;
        // combine the final result
        String finalResult=shoppingInfo+"..."+billingInfo;
        return  new ResponseEntity<String>(finalResult, HttpStatus.OK);
    }
}
