package com.gypsycoder.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gypsycoder.services.WelcomeService;

@RestController
public class WelcomeController {
	
	@Autowired
	private WelcomeService welcomeService;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return welcomeService.retrieveMessage();
	}
	
	@RequestMapping("/greetings")
	public String greeting() {
		return welcomeService.retrieveMessage();
	}
}
