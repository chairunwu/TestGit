package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class TestSpringBootController {
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "hahahah123";
		return "hahahah456";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TestSpringBootController.class, args);
	}
}
