package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class WebController {

	@GetMapping("/home")
    public String vue(){
		System.out.println("index~~");
		return "index";
    }
}