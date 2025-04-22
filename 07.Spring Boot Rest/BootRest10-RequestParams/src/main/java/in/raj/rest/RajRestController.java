package in.raj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/RajRequestParam-Api")
@RestController
public class RajRestController {

    @GetMapping("/register")
    public ResponseEntity<String> registerRajData(@RequestParam("rno") int no) {
        return new ResponseEntity<String>("RequestParam value is :: "+no, HttpStatus.OK);
    }
    @GetMapping("/register2")
    public ResponseEntity<String> registerRajData1(@RequestParam("rno") int no, @RequestParam("name") String name) {
        return new ResponseEntity<String>(" RequestParam value is :: "+ no+" "+ name, HttpStatus.OK);
    }
}
