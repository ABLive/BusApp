package com.bus.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus.app.pojo.Driver;

public interface DriverRepo extends JpaRepository<Driver, Integer> {

}