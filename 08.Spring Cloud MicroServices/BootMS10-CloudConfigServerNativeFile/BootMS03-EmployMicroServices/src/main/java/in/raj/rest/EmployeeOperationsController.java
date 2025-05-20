package in.raj.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Employee-Api")
public class EmployeeOperationsController {
    @Value("${dbuser}")
    private   String   username;
    @Value("${dbpass}")
    private  String  password;

    @GetMapping("/show")
    public ResponseEntity<String> showData(){
        return  new ResponseEntity<String>("DB Properties::"+username+"..."+password, HttpStatus.OK);
    }

}