package in.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BootMs03EmployeeRestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMs03EmployeeRestServiceApplication.class, args);
    }

}
