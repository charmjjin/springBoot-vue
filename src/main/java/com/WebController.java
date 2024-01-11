package com;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WebController {

	@GetMapping("/home")
    public @ResponseBody HashMap<String, String> home(){
		System.out.println("index~~");
		HashMap<String, String> res = new HashMap<String, String>();
		res.put("res", "succ");
		return res;
    }
}