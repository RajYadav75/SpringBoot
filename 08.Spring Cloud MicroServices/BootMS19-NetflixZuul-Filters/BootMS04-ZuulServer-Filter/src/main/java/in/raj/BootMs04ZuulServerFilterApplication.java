package in.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class BootMs04ZuulServerFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMs04ZuulServerFilterApplication.class, args);
    }

}
