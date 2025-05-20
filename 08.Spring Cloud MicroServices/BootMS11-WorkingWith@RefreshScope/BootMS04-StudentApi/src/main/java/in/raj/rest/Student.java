package in.raj.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student-Api")
@RefreshScope
public class Student {
    @Value("${dbuser}")
    private String user;
    @Value("${dbpass}")
    private String password;

    @GetMapping("/std")
    public ResponseEntity<String> getStudentData() {
        return new ResponseEntity<>("Student db user name is " + user + "my db password is"+ password, HttpStatus.OK);
    }
}
