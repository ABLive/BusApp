package com.bus.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus.app.pojo.Route;

public interface RouteRepo extends JpaRepository<Route, Integer> {

}