package com;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.ApiResponse;

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
	
	@PostMapping("/home2")
    public @ResponseBody ApiResponse<String> home2(){
		System.out.println("index~~2");
		
		
		return ApiResponse.createSuccess("test");
    }
	
	
}