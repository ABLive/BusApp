package com.bus.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.app.pojo.Conductor;
import com.bus.app.repo.ConductorRepo;
import com.bus.app.service.ConductorService;

@Service
public class ConductorServiceImpl implements ConductorService {

	@Autowired
	ConductorRepo conductorRepo;

	@Override
	public Optional<Conductor> getConductorInformationByConductorId(Integer conductorId) {
		
		return conductorRepo.findById(conductorId);
	}

	@Override
	public List<Conductor> getInformationForAllConductors() {

		return conductorRepo.findAll();
	}
	
}