package com.rakesh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/")
	public String demo() {
		System.out.println("second commit");
System.out.println("third commit");
		return null;
	}
}
