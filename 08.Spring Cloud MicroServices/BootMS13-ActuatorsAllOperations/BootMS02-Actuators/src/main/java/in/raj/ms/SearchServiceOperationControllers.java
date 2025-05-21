package in.raj.ms;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Search-Api")
public class SearchServiceOperationControllers {

    @GetMapping("/welcome")
    public ResponseEntity<String> searchServiceMsg() {
        return new ResponseEntity<>("Welcome to Search Service of Flipkart.com", HttpStatus.OK);
    }
}
