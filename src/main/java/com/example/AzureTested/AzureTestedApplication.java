package com.example.AzureTested;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureTestedApplication {
	
	@GetMapping("/message")
	public String message() {
		return " New Azure Application";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureTestedApplication.class, args);
	}

}
