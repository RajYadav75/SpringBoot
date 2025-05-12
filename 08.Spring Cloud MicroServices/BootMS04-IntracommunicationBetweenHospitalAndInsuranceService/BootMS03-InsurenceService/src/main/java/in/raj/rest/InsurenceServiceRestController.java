package in.raj.rest;

import in.raj.client.InsurenceServiceConsumerClientComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/Insurence-Api")
public class InsurenceServiceRestController {
    @Autowired
    private InsurenceServiceConsumerClientComponent is;

    @GetMapping("/info")
    public ResponseEntity<String> insuranceInfo() {
        //TODO: Use provider MS
        String insurenceInfo = is.getInsurenceInfo();
        //TODO: get Insurance MS result
        String insurancepriceInfo = "The insurance price is :: " +new Random().nextInt(20000);
        //TODO: Combine the final Result
        String finalResult = insurancepriceInfo + "...." + insurenceInfo;
        return new ResponseEntity<>(finalResult, HttpStatus.OK);
    }
}
