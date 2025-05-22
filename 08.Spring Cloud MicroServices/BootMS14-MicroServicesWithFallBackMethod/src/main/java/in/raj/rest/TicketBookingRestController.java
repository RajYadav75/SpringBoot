package in.raj.rest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/Ticket-Api")
public class TicketBookingRestController {


    @GetMapping("/booking")
    @HystrixCommand(fallbackMethod = "dummyBookTickets")
    public ResponseEntity<String> bookTickets() {
        System.out.println("TicketBookingRestController.bookTickets() method called----Business Method");
        if (new Random().nextInt(10)<5){
            throw new RuntimeException("Problem in TicketBookingRestController.bookTickets() b.logics of ticket booking");
        }
        return new ResponseEntity<>("Ticket is Book successfully", HttpStatus.OK);
    }

    public ResponseEntity<String> dummyBookTickets() {
        System.out.println("TicketBookingRestController.dummyBookTickets()");
        return new ResponseEntity<>("Problem in Ticket Booking...inconvience is regrated", HttpStatus.OK);
    }
}
