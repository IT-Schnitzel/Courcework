package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuditoriumManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuditoriumManagementApplication.class, args);
        System.out.println("Auth Service is running on http://localhost:8082");
    }
}
