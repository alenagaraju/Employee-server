package com.nt.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
@GetMapping("/employee")
public String getEmployeeMessage()
{
	return "Hello from Employee Service";
	
}
}
