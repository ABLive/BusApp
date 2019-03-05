package com.bus.app.service;

import java.util.List;
import java.util.Optional;

import com.bus.app.pojo.Bus;

public interface BusService {

	Optional<Bus> getBusInformationByBusId(Integer busId);
	
	List<Bus> getInformationForAllBuses();

	int getMaxIdFromBuses();
	
}