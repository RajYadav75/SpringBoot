package in.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootMs01EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMs01EurekaServerApplication.class, args);
    }

}
