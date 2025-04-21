package in.raj.rest;

import in.raj.modal.Dost;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Dost-Api")
public class DostRestOperations {
    @PostMapping("/register")
    public ResponseEntity<Dost> registerDost(@RequestBody Dost dost) {
        System.out.println("DostRestOperations.registerDost");
//        dost.setBillAmount(dost.getBillAmount()+1000.0f);
        System.out.println(dost);
        return new ResponseEntity<>(dost, HttpStatus.OK);
    }
}
