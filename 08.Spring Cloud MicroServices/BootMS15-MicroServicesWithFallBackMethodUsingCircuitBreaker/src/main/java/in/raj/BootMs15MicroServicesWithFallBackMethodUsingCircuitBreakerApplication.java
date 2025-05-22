package in.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class BootMs15MicroServicesWithFallBackMethodUsingCircuitBreakerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMs15MicroServicesWithFallBackMethodUsingCircuitBreakerApplication.class, args);
    }

}
