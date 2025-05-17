package in.raj.bootms03consumerapp.cms;

import in.raj.bootms03consumerapp.feignClientpkg.IBillingServiceOperationsConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/Shopping-Api")
public class ShoppingServiceOperationsController {
    @Autowired
    private IBillingServiceOperationsConsumerClient client;

    @GetMapping("/info")
    public ResponseEntity<String> shoppingInfo() {
        System.out.println("Proxy Class Names:: " + client.getClass());
        //Use the provider MS
        String billingInfo = client.getPaymentOptions().getBody();
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Get Shopping MS result
        String shoppingInfo = "The shopping BillAmount is :: " + new Random().nextInt(20000);
        //Combine the final result
        String finalResult = shoppingInfo + "...." + billingInfo;
        return new ResponseEntity<>(finalResult, HttpStatus.OK);
    }
}
