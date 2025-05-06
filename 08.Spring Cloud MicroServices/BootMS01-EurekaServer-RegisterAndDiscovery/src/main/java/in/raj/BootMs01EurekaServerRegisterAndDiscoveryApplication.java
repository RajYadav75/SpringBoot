package in.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
/*
* Enable the eureka Register and Discovery server
* related Auto Configurations activities.
*/
public class BootMs01EurekaServerRegisterAndDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMs01EurekaServerRegisterAndDiscoveryApplication.class, args);
    }

}
