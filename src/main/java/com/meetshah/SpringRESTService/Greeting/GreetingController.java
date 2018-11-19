package com.meetshah.SpringRESTService.Greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meetshah.SpringRESTService.Greeting.models.Greeting;

@RestController
public class GreetingController {

	@GetMapping("/greeting")
	public Greeting sendGreeting() {
		return new Greeting("Meet", "Shah");
	}
}
