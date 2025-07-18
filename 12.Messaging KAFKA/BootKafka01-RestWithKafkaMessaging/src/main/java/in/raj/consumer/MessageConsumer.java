package in.raj.consumer;

import in.raj.store.MessageStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    @Autowired
    private MessageStore store;
    @KafkaListener(topics = "${app.topic.name}",groupId = "group1")
    public void readMessage(String message){
        //Add the received message to MessageStore
        store.addMessage(message);
    }
}
