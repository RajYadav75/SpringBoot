package in.raj.rest;

import in.raj.util.ForIntraCommunication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ticket-Api")
public class TicketRestController {

    @Autowired
    private ForIntraCommunication com;

    @GetMapping("/ticket")
    public ResponseEntity<String> ticketInfo() {
        String ticket = com.ticket();
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    }
}
