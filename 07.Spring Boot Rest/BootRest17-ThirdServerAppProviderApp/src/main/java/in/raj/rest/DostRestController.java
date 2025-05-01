package in.raj.rest;

import in.raj.modal.Dost;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Dost-Api")
public class DostRestController {
    @GetMapping("/wish")
    public ResponseEntity<?> wishMsg(){
        return new ResponseEntity<>("Good Morning Friends..", HttpStatus.OK);
    }
    @GetMapping("/dost/{id}/{name}")
    public ResponseEntity<?> dostMsg(@PathVariable int id, @PathVariable String name){
        return new ResponseEntity<>("Good Morning Friends.."+id+"..."+name, HttpStatus.OK);
    }
    @PostMapping("/register")
    public ResponseEntity<?> registerMsg(@RequestBody Dost dost){
        return new ResponseEntity<>("Dost Data"+dost.toString(), HttpStatus.CREATED);
    }
    @GetMapping("/report")
    public ResponseEntity<Dost> reportMsg(){
        Dost dost = new Dost(1,"Raj Yadav","Ankita Tiwari",20000.00);
        return new ResponseEntity<Dost>(dost, HttpStatus.OK);
    }

    @GetMapping("/reportAll")
    public ResponseEntity<List<Dost>> reportAllMsg(){
        Dost dost1 = new Dost(1,"Deepak Kumar","Kanchan",150000.00);
        Dost dost2 = new Dost(2,"Vidhan Chand ","Rekha",250000.00);
        Dost dost3 = new Dost(3,"Rajneesh Bhai","Sabina",350000.00);
        Dost dost4 = new Dost(4,"Ambrikesh","I don't know ",450000.00);
        List<Dost> dostList = List.of(dost1,dost2,dost3,dost4);
        return new ResponseEntity<List<Dost>>(dostList, HttpStatus.OK);
    }
}
