package com.bus.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus.app.pojo.Bus;

public interface BusRepo extends JpaRepository<Bus, Integer> {

}