package com.bus.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestBusController {

	@RequestMapping(value = "/sonu/learningREST", method = RequestMethod.GET)
	public TestBus something() {
		
		TestBus t1 = new TestBus();
		
		t1.setTestBusId(1001);
		t1.setBusColor("RED");
		
		return t1;
	}
	
}