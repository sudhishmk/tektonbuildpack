package com.example.buildpack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BuildpackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuildpackApplication.class, args);
	}

	@GetMapping("/hello")
    public String hello() {
        return "Testing if Build Pack demo works fine for Java Springboot App!";
    }

}
