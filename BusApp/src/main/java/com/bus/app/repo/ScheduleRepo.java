package com.bus.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus.app.pojo.Schedule;

public interface ScheduleRepo extends JpaRepository<Schedule, Integer>{

}