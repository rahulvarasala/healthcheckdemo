package com.poc.healthcheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	
	@GetMapping("/test/health")
	public String testHealth() {
		return "OK";
	}
}
