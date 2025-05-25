package in.raj;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class BootMs02ProviderMicroServiceApplication {

    public static void main(String[] args) {
        log.info("Start of the Main Method of Billing Micro Service");
        SpringApplication.run(BootMs02ProviderMicroServiceApplication.class, args);
        log.info("App is Boot Strapped --> Billing Micro Service");
        log.info("End of the Main Method of Billing Micro Service");
    }

}
