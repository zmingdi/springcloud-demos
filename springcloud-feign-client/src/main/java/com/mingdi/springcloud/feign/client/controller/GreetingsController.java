package com.mingdi.springcloud.feign.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mingdi.springcloud.feign.client.service.GreetingsService;

@RestController
public class GreetingsController {

	@Autowired
	GreetingsService service;
	
	@GetMapping("/hello")
	public String hello(String name) {
		return service.hello(name);
	}
	
	@GetMapping("/bye")
	public String bye(String name) {
		//return service.sayBye(name);
		return "";
	}
}
