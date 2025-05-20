package in.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BootMs02CloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMs02CloudConfigServerApplication.class, args);
    }

}
