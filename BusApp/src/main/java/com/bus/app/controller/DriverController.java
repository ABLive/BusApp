package com.bus.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bus.app.pojo.Driver;
import com.bus.app.service.DriverService;

@RestController
@RequestMapping(value = "/driver")
public class DriverController {

	@Autowired
	DriverService driverService;
	
	@RequestMapping(value = "/driverInfo/{driverId}", method = { RequestMethod.GET, RequestMethod.POST })
	public Optional<Driver> getDriverInformationByDriverId(@PathVariable("driverId") int driverId) {
		
		return driverService.getDriverInformationByDriverId(driverId);
	}
	
	@RequestMapping(value = "/driverInfo/getAllDrivers", method = { RequestMethod.GET, RequestMethod.POST })
	public List<Driver> getInformationForAllDrivers() {
		
		return driverService.getInformationForAllDrivers();
	}
	
}