package com.mingdi.springcloud.eureka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingsService {
    
	@GetMapping("/hello")
	public String sayHello(@RequestParam String name){
		return "Hello, " + name;
	}
	
	@GetMapping("/bye/{name}")
	public String bye(@PathVariable(name="name") String name) {
		return "Bye, " + name;
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome!!";
	}
}
