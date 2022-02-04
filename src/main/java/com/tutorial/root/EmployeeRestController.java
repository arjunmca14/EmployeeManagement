package com.tutorial.root;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {
	
	@GetMapping("hai")
	public String method1()
	{
		return "this is String";
	}

}
