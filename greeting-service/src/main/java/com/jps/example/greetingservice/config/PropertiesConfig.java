package com.jps.example.greetingservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesConfig {

	@Value("${instance_no}")
	private String instanceNumber;
	
	public String getInstanceNumber() {
		return instanceNumber;
	}
}
