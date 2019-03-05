package com.bus.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus.app.pojo.Conductor;

public interface ConductorRepo extends JpaRepository<Conductor, Integer> {

}