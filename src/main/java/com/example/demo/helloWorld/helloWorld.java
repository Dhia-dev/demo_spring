package com.example.demo.helloWorld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class helloWorld {

	
	@GetMapping("/hello")
	public String getFournisseurs() {
		
		return "hello world";
	}

	
	
}
