package in.raj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("Greet-Api")
public class GreetRestController {
    @GetMapping("/greetMsg")
    public ResponseEntity<String> getGreetMsg(){
        LocalDateTime ldt = LocalDateTime.now();
        String msg = null;
        int hour = ldt.getHour();
        if(hour < 12){
            msg = "Hello Good Morning!";
        } else if (hour == 12 || hour <=16) {
            msg = "Hello Good Afternoon!";
        }
        else if(hour == 16 || hour <=18){
            msg = "Hello Good Evening!";
        }
        else {
            msg = "Hello Good Night!";
        }
        //Create and Return ResponseEntity Object having response content and status code
        return new ResponseEntity<String>(msg, HttpStatus.OK);
    }
}
