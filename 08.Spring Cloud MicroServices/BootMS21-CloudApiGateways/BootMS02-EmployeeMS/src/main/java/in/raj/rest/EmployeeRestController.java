package in.raj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee-api")
public class EmployeeRestController {

    @GetMapping("/report")
    public ResponseEntity<String> getEmployeeDetails() {
        return new ResponseEntity<>("Employee details :: My boss name is Raj Yadav", HttpStatus.OK);
    }
}
