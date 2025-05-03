package in.raj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BootRest21")
public class RestControllerUsingException {
    @GetMapping("/")
    public ResponseEntity<?> home(@RequestParam int id,@RequestParam String name) {
        return new ResponseEntity<>(id+" "+name, HttpStatus.OK);
    }
}
