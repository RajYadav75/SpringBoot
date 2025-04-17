package in.raj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Htp-Api")
public class RajRestController {

    @GetMapping("/report")
    public ResponseEntity<String> showReport(){
        System.out.println("RajRestController.showReport");
        return new ResponseEntity<>("ReportOperation,This is GetMapping", HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(){
        System.out.println("RajRestController.register");
        return new ResponseEntity<>("RegisterOperation,This is PostMapping", HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(){
        System.out.println("RajRestController.update");
        return new ResponseEntity<>("UpdateOperation,This is PutMapping", HttpStatus.OK);
    }

    @PatchMapping("/thoda-update")
    public ResponseEntity<String> updateMethod(){
        System.out.println("RajRestController.updateMethod");
        return new ResponseEntity<>("UpdateOperation,This is PatchMapping", HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteReq(){
        System.out.println("RajRestController.deleteReq");
        return new ResponseEntity<>("DeleteOperation,This is DeleteMapping", HttpStatus.OK);
    }
}
