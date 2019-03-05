package com.bus.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bus.app.pojo.Route;
import com.bus.app.service.RouteService;

@RestController
@RequestMapping(value = "/route")
public class RouteController {

	@Autowired
	RouteService routeService;
	
	@RequestMapping(value = "/routeInfo/{routeId}", method = { RequestMethod.GET, RequestMethod.POST })
	public Optional<Route> getRouteInformationByRouteId(@PathVariable("routeId") int routeId) {
		
		return routeService.getRouteInformationByRouteId(routeId);
	}
	
	@RequestMapping(value = "/routeInfo/getAllRoutes", method = { RequestMethod.GET, RequestMethod.POST })
	public List<Route> getInformationForAllRoutes() {
		
		return routeService.getInformationForAllRoutes();
	}
	
}