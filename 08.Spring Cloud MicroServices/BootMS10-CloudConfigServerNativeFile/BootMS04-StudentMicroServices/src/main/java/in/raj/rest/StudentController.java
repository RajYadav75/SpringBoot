package in.raj.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student-Api")
public class StudentController {
    @Value("${dbuser}")
    private String username;
    @Value("${dbpass}")
    private String password;

    @GetMapping("/student")
    public ResponseEntity<String> getInformation() {
        return new ResponseEntity<>("The value of username is " + username+" and the value of password is "+password, HttpStatus.OK);
    }
}
