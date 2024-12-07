package com.klef.jfsd.exam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@GetMapping("/")
	public String home() {
		return "<h1> 2200031919 Mukunda Sai Chakravartula </h1>";
	}
}
