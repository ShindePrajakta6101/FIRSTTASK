package com.example.mypkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.controller")
@EnableJpaRepositories(basePackages = {"com.repository"})
@EntityScan("com.entity")
public class TaskinternshipApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskinternshipApplication.class, args);
		}
	}


