package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;

/**
 * Created by jt on 5/24/17.
 */

@Controller
public class ConstructorInjectedController {

	
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
