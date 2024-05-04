package com.example.springmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMicroserviceApplication.class, args);
    }

}
