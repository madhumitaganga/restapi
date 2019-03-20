package com.restapi2.empmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class EmpmongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpmongoApplication.class, args);
	}

}
