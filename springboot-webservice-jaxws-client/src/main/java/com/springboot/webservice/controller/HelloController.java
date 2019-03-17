package com.springboot.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.webservice.helloService.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService service;
	
	@GetMapping("sayHello")
	public Object sayHello(String name) throws Exception {
		return service.sayHello(name);
	}
}
