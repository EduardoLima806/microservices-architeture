package com.jps.example.usergreetingservice.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jps.example.usergreetingservice.config.GreetingProxy;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class GreetingConsumer {

    @Autowired
    private GreetingProxy greetingProxy;
    
    
    @HystrixCommand(fallbackMethod = "getDefaultGreeting")
    public String getRandomGreeting() {
    	return greetingProxy.greeting();
    }

    public String getDefaultGreeting() {
        return "Good bye";
    }
}
