package in.raj.rest;

import in.raj.modal.Dost;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
