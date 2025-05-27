package in.raj;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class BootMs01EurekaServerElkApplication {

    public static void main(String[] args) {
        log.info("Starting Eureka Server");
        SpringApplication.run(BootMs01EurekaServerElkApplication.class, args);
        log.info("Application is Bootstrapped Successfully :: Eureka Server");
        log.info("End of the application ::  Eureka Server");
    }

}
