package in.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BootMs06ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMs06ConfigServerApplication.class, args);
    }

}
