package com.example.rate_limiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RateLimiterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RateLimiterApplication.class, args);
	}

}

@RestController
class TestController {

    @GetMapping("/unlimited")
    public String unlimited() {
        return "Unlimited! Let's Go!";
    }

    @GetMapping("/limited")
    public String limited() {
        return "Limited, don't over use me!";
    }
}