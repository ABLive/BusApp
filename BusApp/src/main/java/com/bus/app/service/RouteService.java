package com.bus.app.service;

import java.util.List;
import java.util.Optional;

import com.bus.app.pojo.Route;

public interface RouteService {

	Optional<Route> getRouteInformationByRouteId(Integer routeId);
	
	List<Route> getInformationForAllRoutes();
	
}