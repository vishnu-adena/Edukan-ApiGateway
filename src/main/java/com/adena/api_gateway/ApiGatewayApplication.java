package com.adena.api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

    public static void main(String[] args) {
        // Retrieve execution profile from environment variable. Otherwise, default profile is used.
        String profile = System.getenv("PROFILE");
        System.setProperty("spring.profiles.active", profile != null ? profile : "default");
        SpringApplication.run(ApiGatewayApplication.class, args);
    }


}
