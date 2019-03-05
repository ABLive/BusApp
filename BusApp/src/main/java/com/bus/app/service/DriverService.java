package com.bus.app.service;

import java.util.List;
import java.util.Optional;

import com.bus.app.pojo.Driver;

public interface DriverService {

	Optional<Driver> getDriverInformationByDriverId(Integer driverId);
	
	List<Driver> getInformationForAllDrivers();
	
}