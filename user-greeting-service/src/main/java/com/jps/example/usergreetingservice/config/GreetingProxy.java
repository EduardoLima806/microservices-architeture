package com.jps.example.usergreetingservice.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="greeting-service")
public interface GreetingProxy {

	@RequestMapping("/greeting")
	public String greeting();
}
