package in.raj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Raj-Api")
public class RajController {
    @GetMapping("/display")
    public ResponseEntity<String> displayData() {
        return new ResponseEntity<>("Aur Raj Bhai kaise ho!", HttpStatus.OK);
    }
}
