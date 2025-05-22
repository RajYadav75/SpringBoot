package in.raj.rest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/Ticket-Api")
public class TicketBookingRestController {

    private int count = 0;

    //Business Method
    @GetMapping("/booking")
    @HystrixCommand(fallbackMethod = "dummyBookTicket",
            commandProperties = {
                    @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),  //TODO:-> Enable The circuit breaker
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
            })
    public ResponseEntity<String> getTicketBooking() {
        System.out.println("TicketBookingRestController.getTicketBooking");
        if (new Random().nextInt(10) < 9) {
            throw new RuntimeException("Problem  b.logic of  ticket booking:: ");
        }
        return new ResponseEntity<>("Ticket Booked Successfully", HttpStatus.OK);
    }

    //FallBackMethod
    public ResponseEntity<String> dummyBookTicket() {
        count++;
        System.out.println("TicketBookingRestController.dummyBookTicket count :: ---  " + count);
        return new ResponseEntity<>("Problem in Ticket booking,... inconvience is regrated....", HttpStatus.OK);
    }

}
