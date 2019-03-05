package com.bus.app.repo.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bus.app.pojo.Bus;
import com.bus.app.repo.BusCustomRepo;

@Repository
public class BusCustomRepoImpl implements BusCustomRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Bus> busDetails() {
		
		List<Bus> busMax = (List<Bus>) jdbcTemplate.query("select * from bus where busid in (select max(busid) from bus)", new RowMapper<Bus>() {

			@Override
			public Bus mapRow(ResultSet rs, int num) throws SQLException {
				
				Bus bus = new Bus();
				
				bus.setBusid(rs.getInt(1));
				bus.setBusno(rs.getString(2));
				return bus;
			}	
		});
		
		return busMax;
	}
	
}