package in.raj.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Customer-Api")
public class CustomerRestController {
    @Value("${dbuser}")
    private String user;
    @Value("${dbpass}")
    private String password;


    @GetMapping("/display")
    public ResponseEntity<String> getData() {
        return new ResponseEntity<>("Customer -> Data collected Through Config Server::"+user+":: "+password, HttpStatus.OK);
    }
}
