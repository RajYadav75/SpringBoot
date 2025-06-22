package in.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class BootKafka01RestWithKafkaMessagingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootKafka01RestWithKafkaMessagingApplication.class, args);
    }

}
