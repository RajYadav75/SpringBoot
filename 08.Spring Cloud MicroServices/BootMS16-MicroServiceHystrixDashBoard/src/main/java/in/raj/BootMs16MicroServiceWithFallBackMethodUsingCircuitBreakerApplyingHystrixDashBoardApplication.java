package in.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class BootMs16MicroServiceWithFallBackMethodUsingCircuitBreakerApplyingHystrixDashBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMs16MicroServiceWithFallBackMethodUsingCircuitBreakerApplyingHystrixDashBoardApplication.class, args);
    }

}
