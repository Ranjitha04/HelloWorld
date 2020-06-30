package com.example.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    /* the mapping gives welcome message*/
	/*one more comment*/
	@GetMapping("/")
	public String welcomeMessage() {
		return "Welcome To Hellworld Application";
	}
}
