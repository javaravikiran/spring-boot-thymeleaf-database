package com.javaravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootThymeleafDatabaseApplication {
	
//Booting application from here
	public static void main(String[] args) {
		SpringApplication.run(SpringBootThymeleafDatabaseApplication.class, args);
	}

}
