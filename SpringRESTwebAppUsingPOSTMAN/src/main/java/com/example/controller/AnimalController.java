package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AnimalController {
	@RequestMapping("soujan")
	public String home1()
	{
		System.out.println("I am tiger");
		return "animal.txt";
	}
}
