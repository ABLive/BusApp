package com.bus.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.app.pojo.Driver;
import com.bus.app.repo.DriverRepo;
import com.bus.app.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	DriverRepo driverRepo;
	
	@Override
	public Optional<Driver> getDriverInformationByDriverId(Integer driverId) {
		
		return driverRepo.findById(driverId);
	}

	@Override
	public List<Driver> getInformationForAllDrivers() {
		
		return driverRepo.findAll();
	}

}