package com.architdev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Controller {
	
	
	@GetMapping("/data")
	public String getData()
	{
		return "First data";
	}
}
