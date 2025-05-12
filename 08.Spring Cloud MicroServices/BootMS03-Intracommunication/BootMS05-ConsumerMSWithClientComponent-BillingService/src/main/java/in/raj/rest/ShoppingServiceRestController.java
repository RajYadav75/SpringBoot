package in.raj.rest;

import in.raj.helper.BillingServiceRestConsumerHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/Shopping-Api")
public class ShoppingServiceRestController {
    @Autowired
    private BillingServiceRestConsumerHelper consumerHelper;

    @GetMapping("/details")
    public ResponseEntity<String> showBillingDetails() {
        //TODO:- Use Client component support to invoke Provider MS Service
        String resultBody = consumerHelper.getBillingInfo();
        //TODO-: Return ResponseEntity<String> Object  from consumer MS
        String billInfo = "Bill Info: " + new Random().nextInt(10000);// Consumer MS Result
        //TODO:- Contains Provider and Consumer MicroServices
        return new ResponseEntity<>(billInfo+"......."+resultBody, HttpStatus.OK);

    }
}
