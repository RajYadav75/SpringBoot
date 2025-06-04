package in.raj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-api")
public class CustomerRestController {

    @GetMapping("/info")
    public ResponseEntity<String> getCustomerInfo() {

        return new ResponseEntity<>("Customer Info is Baba Yaga", HttpStatus.OK);
    }
}
