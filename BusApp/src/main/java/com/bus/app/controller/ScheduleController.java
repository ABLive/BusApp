package com.bus.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.app.pojo.Schedule;
import com.bus.app.service.ScheduleService;

@RestController
@RequestMapping(value = "/schedule")
public class ScheduleController {

	@Autowired
	ScheduleService scheduleService;
	
	@RequestMapping(value = "/scheduleInfo/getAllSchedules")
	public List<Schedule> getInformationForAllSchedules() {
		
		return scheduleService.getAllSchedules();
		
	}
	
}