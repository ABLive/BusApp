package com.bus.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus.app.pojo.RouteStop;
import com.bus.app.pojo.RouteStopId;

public interface RouteStopRepo extends JpaRepository<RouteStop, RouteStopId> {

}