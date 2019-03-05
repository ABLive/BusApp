package com.bus.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.app.pojo.Route;
import com.bus.app.repo.RouteRepo;
import com.bus.app.service.RouteService;

@Service
public class RouteServiceImpl implements RouteService {

	@Autowired
	RouteRepo routeRepo;

	@Override
	public Optional<Route> getRouteInformationByRouteId(Integer routeId) {
		
		return routeRepo.findById(routeId);
	}

	@Override
	public List<Route> getInformationForAllRoutes() {

		return routeRepo.findAll();
	}
	
}