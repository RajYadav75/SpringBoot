package in.raj.rest;

import in.raj.configurer.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Msg-Api")
public class MSGRestController {
    @Autowired
    private Consumer consumer;

    @GetMapping("/info")
    public ResponseEntity<String> getMsgInfo() {
        String msgInfo = consumer.getMsgInfo();
        return new ResponseEntity<>(msgInfo, HttpStatus.OK);
    }
}
