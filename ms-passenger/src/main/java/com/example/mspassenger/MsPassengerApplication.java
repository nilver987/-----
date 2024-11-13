package com.example.mspassenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsPassengerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsPassengerApplication.class, args);
    }

}
