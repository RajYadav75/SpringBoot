package in.raj.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Employ-Api")
@RefreshScope
public class EmpRestController {
    @Value("${dbuser}")
    private String user;
    @Value("${dbpass}")
    private String password;

    @GetMapping("/emp")
    public ResponseEntity<String> getEmpData() {
        return new ResponseEntity<>("My db user name is " + user + "my db password is"+ password, HttpStatus.OK);
    }
}
