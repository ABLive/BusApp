package com.bus.app.service;

import java.util.List;
import java.util.Optional;

import com.bus.app.pojo.Conductor;

public interface ConductorService {

	Optional<Conductor> getConductorInformationByConductorId(Integer conductorId);
	
	List<Conductor> getInformationForAllConductors();
	
}