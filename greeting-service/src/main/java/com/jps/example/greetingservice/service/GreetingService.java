package com.jps.example.greetingservice.service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jps.example.greetingservice.config.PropertiesConfig;

@Service
public class GreetingService {
	
	@Autowired
	private PropertiesConfig properties;

    private List<String> greetings = Arrays.asList("Hi", "Hello", "Hey");

    public String getGreeting() {
        Random random = new Random();
        int randomIndex = random.nextInt(greetings.size());
        return "[" + properties.getInstanceNumber() + "] " + greetings.get(randomIndex);
    }

}
