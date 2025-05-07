package in.raj.restcontrollerformicroservices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Service-Api")
public class PublishingMicroServicesController {

    @GetMapping("/greet")
    public ResponseEntity<String> displayGreeting() {
        return new ResponseEntity<>("Hello Server,I am Publisher(Client) to want to connect with you. through Raj Yadav", HttpStatus.OK);
    }
}
