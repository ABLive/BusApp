package com.bus.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bus.app.pojo.Bus;
import com.bus.app.service.BusService;

@RestController
@RequestMapping(value = "/bus")
public class BusController {

	@Autowired
	BusService busService;
	
	@RequestMapping(value = "/busInfo/{busId}", method = { RequestMethod.GET, RequestMethod.POST })
	public Optional<Bus> getBusInformationByBusId(@PathVariable("busId") int busId) {
		
		return busService.getBusInformationByBusId(busId);
	}
	
	@RequestMapping(value = "/busInfo/getAllBuses", method = { RequestMethod.GET, RequestMethod.POST })
	public List<Bus> getInformationForAllBuses() {
		
		return busService.getInformationForAllBuses();
	}
	
	@RequestMapping(value = "/busInfo/maxBusId", method = { RequestMethod.GET, RequestMethod.POST })
	public int getMaxBusIdFromBuses() {
		
		return busService.getMaxIdFromBuses();
	}
	
}