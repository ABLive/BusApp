package com.bus.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bus.app.pojo.RouteStop;
import com.bus.app.repo.RouteStopRepo;


@RestController
@RequestMapping(value = "/specificroute")
public class SpecificRouteController {
	
	@Autowired
	RouteStopRepo routeStopRepo;

	@RequestMapping(value = "/getroute", method = RequestMethod.GET)
	public List<RouteStop> getSpecificRoute(HttpServletRequest request, HttpServletResponse response) {
		
		String routeId = request.getParameter("routeid");
		
		List<RouteStop> list = routeStopRepo.findAll();
		
		List<RouteStop> filteredList = new ArrayList<RouteStop>();

		for (RouteStop routeStop : list) {
			if((Integer.toString(routeStop.getRouteStopId().getRouteid().getRouteid())).equals(routeId)) {
				filteredList.add(routeStop);
			}
		}
		
		return filteredList;		
	}
	
}