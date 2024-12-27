package com.api.mock.Mock_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MockServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockServerApplication.class, args);
	}


	@GetMapping()
	public String getTest(){
		return "Hello World";
	}

}
