package com.bus.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.app.pojo.Bus;
import com.bus.app.repo.BusCustomRepo;
import com.bus.app.repo.BusRepo;
import com.bus.app.service.BusService;

@Service
public class BusServiceImpl implements BusService {

	@Autowired
	BusRepo busRepo;
	
	@Autowired
	BusCustomRepo busCustomRepo;
	
	@Override
	public Optional<Bus> getBusInformationByBusId(Integer busId) {
		
		return busRepo.findById(busId);
	}

	@Override
	public List<Bus> getInformationForAllBuses() {
		
		return busRepo.findAll();
	}

	@Override
	public int getMaxIdFromBuses() {
		
		List<Bus> busForMax = busCustomRepo.busDetails();
		return busForMax.get(0).getBusid();
	}

}