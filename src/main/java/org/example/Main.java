package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"org.example"})
@EntityScan(basePackages = {"org.example.domain.entity"})
@EnableJpaRepositories(basePackages = {"org.example.repository"})
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}