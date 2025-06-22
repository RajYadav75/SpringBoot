package in.raj.rest;

import in.raj.producer.MessageProducer;
import in.raj.store.MessageStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KakfaMessagingOperationsController {
    @Autowired
    private MessageProducer producer;
    @Autowired
    private MessageStore store;
    @GetMapping("/send")
    public ResponseEntity<String> send(@RequestParam("message") String message){
        //Send the message Through producer
        String result = producer.sendMessage(message);
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }
    @GetMapping("/readAll")
    public ResponseEntity<List<String>> showAllMessages(){
        //Read All the messges from the message store
        List<String> messagesList = store.showAllMessages();
        return new ResponseEntity<List<String>>(messagesList, HttpStatus.OK);
    }
}
