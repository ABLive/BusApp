package com.bus.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.app.pojo.Schedule;
import com.bus.app.repo.ScheduleRepo;
import com.bus.app.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	ScheduleRepo scheduleRepo;
	
	@Override
	public List<Schedule> getAllSchedules() {
		
		return scheduleRepo.findAll();
	}
	
}