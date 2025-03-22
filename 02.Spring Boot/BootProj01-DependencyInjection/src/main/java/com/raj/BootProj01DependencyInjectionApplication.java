package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class BootProj01DependencyInjectionApplication {
    @Bean
    public LocalDateTime createLDT(){
        return LocalDateTime.now();
    }

    public static void main(String[] args) {
        ApplicationContext ctx =
                SpringApplication.run(BootProj01DependencyInjectionApplication.class);
        ctx.getBean("wmg",WishMessageGenerator.class);
    }

}
