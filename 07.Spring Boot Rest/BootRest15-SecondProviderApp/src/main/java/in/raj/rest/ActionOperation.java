package in.raj.rest;

import in.raj.model.Actor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Actor-Api")
public class ActionOperation {
    @GetMapping("/wish")
    public ResponseEntity<String> getActor() {
        return new ResponseEntity<>("Namaste Sir,Madam", HttpStatus.OK);
    }
    @GetMapping("/wish1/{id}/{name}")
    public ResponseEntity<?> toWish(@PathVariable Integer id, @PathVariable String name) {
        return new ResponseEntity<>("Namaste Sir,Madam "+id+" "+ name, HttpStatus.OK);
    }

    @GetMapping("/report")
    public ResponseEntity<?> getReport() {
        Actor actor = new Actor(1,"Raj Yadav","Kanapar",23000.00);
        return new ResponseEntity<>(actor, HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerActor(@RequestBody Actor actor) {
        return new ResponseEntity<>(actor.toString(), HttpStatus.CREATED);
    }
}
