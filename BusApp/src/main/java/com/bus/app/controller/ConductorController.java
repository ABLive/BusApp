package com.bus.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bus.app.pojo.Conductor;
import com.bus.app.service.ConductorService;

@RestController
@RequestMapping(value = "/conductor")
public class ConductorController {

	@Autowired
	ConductorService conductorService;
	
	@RequestMapping(value = "/conductorInfo/{conductorId}", method = { RequestMethod.GET, RequestMethod.POST })
	public Optional<Conductor> getConductorInformationByConductorId(@PathVariable("conductorId") int conductorId) {
		
		return conductorService.getConductorInformationByConductorId(conductorId);
	} 
	
	@RequestMapping(value = "/conductorInfo/getAllConductors", method = { RequestMethod.GET, RequestMethod.POST })
	public List<Conductor> getInformationForAllConductors() {
		
		return conductorService.getInformationForAllConductors();
	}
	
}