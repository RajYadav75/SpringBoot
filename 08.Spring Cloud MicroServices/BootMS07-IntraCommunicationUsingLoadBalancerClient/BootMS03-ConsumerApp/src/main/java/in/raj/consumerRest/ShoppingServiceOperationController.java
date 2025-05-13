package in.raj.consumerRest;

import in.raj.consumerComponent.LoadBalancerClientClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Shopping-Api")
public class ShoppingServiceOperationController {
    @Autowired
    private LoadBalancerClientClass load;

    @GetMapping("/cart")
    public ResponseEntity<String> doShopping() {
        String billingInfo = load.getBillingInfo();
        try {
            Thread.sleep(20000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Shopping the items (Shirts,Trousers)"+billingInfo, HttpStatus.OK);
    }
}
