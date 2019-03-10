package com.bus.app.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bus.app.pojo.Bus;
import com.bus.app.pojo.Conductor;
import com.bus.app.pojo.Driver;
import com.bus.app.pojo.Route;
import com.bus.app.pojo.Schedule;

@RestController
@RequestMapping(value = "/qrcode")
public class QRCodeController {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	/*@RequestMapping(value = "/qrcodeInfo/getStatusForQRCode", method = RequestMethod.GET)
	public String getValidScheduleForScannedStop(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println(request.getParameter("stopid"));
		return request.getParameter("stopid");
	}*/
	
	@RequestMapping(value = "/qrcodeInfo/getStatusForQRCode", method = RequestMethod.GET)
	public List<Schedule> getValidScheduleForScannedStop(HttpServletRequest request, HttpServletResponse response) {
		
		String stopid = request.getParameter("stopid");
		
		List<Schedule> validSchedule = jdbctemplate.query("select * from schedule where routeid_routeid in (select routeid_routeid from routestop where stopid_stopid = " + stopid +")", new RowMapper<Schedule>() {

			@Override
			public Schedule mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Schedule schedule = new Schedule();
				Bus bus = new Bus();
				Conductor conductor = new Conductor();
				Driver driver = new Driver();
				Route route = new Route();
				
				schedule.setScheduleid(rs.getInt(1));

				//	schedule.setArrivaltime(rs.getDate(2));
				//	schedule.setDeparturetime(rs.getDate(3));
				//	schedule.setScheduledate(rs.getDate(4));
				
				Timestamp arrivalTimeStamp = rs.getTimestamp(2);
				Timestamp departureTimeStamp = rs.getTimestamp(3);
				
				schedule.setArrivaltime(new Date(arrivalTimeStamp.getTime()));
				schedule.setDeparturetime(new Date(departureTimeStamp.getTime()));
				
				schedule.setScheduledate(rs.getDate(4));
				schedule.setScheduleday(rs.getString(5));
				
				bus.setBusid(rs.getInt(6));
				conductor.setConductorid(rs.getInt(7));
				driver.setDriverid(rs.getInt(8));
				route.setRouteid(rs.getInt(9));
				
				schedule.setBusid(bus);
				schedule.setConductorid(conductor);
				schedule.setDriverid(driver);
				schedule.setRouteid(route);
				
				return schedule;
			}
			
			
			
		});
		
		return validSchedule;
	}

}