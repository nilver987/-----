package com.example.msconductor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsConductorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsConductorApplication.class, args);
    }

}
