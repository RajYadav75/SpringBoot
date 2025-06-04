package in.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BootMs03CustomerMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMs03CustomerMsApplication.class, args);
    }

}
