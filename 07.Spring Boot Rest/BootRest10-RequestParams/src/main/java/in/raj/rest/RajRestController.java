package in.raj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/RajRequestParam-Api")
@RestController
public class RajRestController {

    @GetMapping("/register")
    public ResponseEntity<String> registerRajData(@RequestParam("rno") int no) {
        return new ResponseEntity<String>("RequestParam value is :: "+no, HttpStatus.OK);
    }
    @GetMapping("/register1")
    public ResponseEntity<String> registerRajData1(@RequestParam("rno") int no, @RequestParam("name") String name) {
        return new ResponseEntity<String>(" RequestParam value is :: "+ no+" "+ name, HttpStatus.OK);
    }
    @GetMapping("/register2")
    public ResponseEntity<String> registerRajData2(
            @RequestParam("rno") int no,
            @RequestParam(required = false,defaultValue = "Raj Yadav") String name) {
        return new ResponseEntity<String>(" RequestParam value is :: "+ no+" "+ name, HttpStatus.OK);
    }


    @PostMapping("/register3")
    public ResponseEntity<String> registerRajData3(@RequestParam("rno") int no, @RequestParam String name) {
        return new ResponseEntity<>(" RequestParam value is :: "+ no+" "+ name, HttpStatus.CREATED);
    }
}
