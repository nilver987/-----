package com.example.msroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsRouteApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsRouteApplication.class, args);
    }

}
