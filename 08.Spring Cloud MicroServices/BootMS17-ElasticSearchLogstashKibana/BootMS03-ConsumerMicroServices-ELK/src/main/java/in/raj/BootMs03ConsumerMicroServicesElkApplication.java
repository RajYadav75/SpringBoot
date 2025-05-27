package in.raj;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class BootMs03ConsumerMicroServicesElkApplication {

    public static void main(String[] args) {
        log.info("Starting Main method of Micro Services ELK Application (Consumer Application)");
        SpringApplication.run(BootMs03ConsumerMicroServicesElkApplication.class, args);
        log.info("Application is Bootstrapped Successfully ::  Consumer Application");
        log.info("End of the application ::  Consumer Application");
    }

}
