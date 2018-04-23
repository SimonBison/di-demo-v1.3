package com.gmail.spbisoft.didemo.controllers;

import com.gmail.spbisoft.didemo.services.GreetingService;
import com.gmail.spbisoft.didemo.services.GreetingServiceImpl;

public class SetterInjectedController {

    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
