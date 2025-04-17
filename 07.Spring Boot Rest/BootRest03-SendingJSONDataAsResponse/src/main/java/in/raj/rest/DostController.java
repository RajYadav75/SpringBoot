package in.raj.rest;

import in.raj.model.Dost;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("JsonData-Api")
public class DostController {
    @GetMapping("/json")
    public ResponseEntity<Dost> getDostData() {
        System.out.println("DostController.getDostData");
        Dost dost = new Dost(1001,"Raj Yadav","Kanapar Bansgaon Gorakhpur",789653323L);
        return new ResponseEntity<Dost>(dost, HttpStatus.OK);
    }
}
