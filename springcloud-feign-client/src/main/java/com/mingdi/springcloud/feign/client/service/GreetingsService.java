package com.mingdi.springcloud.feign.client.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("EUREKA-CLIENT")
public interface GreetingsService {

	@GetMapping(value="/greetings/hello")
	public String hello(@RequestParam("name") String name);
	
//	@GetMapping("/greetings/bye/{name}")
//	public String sayBye(@PathVariable("name") String name);
}
