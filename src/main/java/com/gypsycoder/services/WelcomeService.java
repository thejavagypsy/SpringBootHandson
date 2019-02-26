package com.gypsycoder.services;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
	public String retrieveMessage() {
		return "Welcome to SpringBoot";
	}
}
