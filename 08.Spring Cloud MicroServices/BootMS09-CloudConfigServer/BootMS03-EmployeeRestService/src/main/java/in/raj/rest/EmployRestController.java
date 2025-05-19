package in.raj.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Employ-Api")
public class EmployRestController {

    @Value("${dbuser}")
    private String user;
    @Value("${dbpass}")
    private String pass;

    @GetMapping("/show")
    public ResponseEntity<String> showData() {
        return new ResponseEntity<>("Employee -> Data collected Through Config Server::"+user+":: "+pass, HttpStatus.OK);
    }
}
