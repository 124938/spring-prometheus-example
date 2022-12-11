package com.shrey.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringPrometheusExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPrometheusExampleApplication.class, args);
	}

	@GetMapping("/something")
	public ResponseEntity<String> createLogs() {
		System.out.println("Just checking");
		return ResponseEntity.ok().body("All Ok");
	}

}
