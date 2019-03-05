package com.bus.app.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Schedule {

	@Id
	private int scheduleid;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Route routeid;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Bus busid;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Driver driverid;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Conductor conductorid;
	
	private Date scheduledate;
	
	private String scheduleday;
	
	private Date departuretime;
	
	private Date arrivaltime;

	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Schedule(int scheduleid, Route routeid, Bus busid, Driver driverid, Conductor conductorid, Date scheduledate,
			String scheduleday, Date departuretime, Date arrivaltime) {
		super();
		this.scheduleid = scheduleid;
		this.routeid = routeid;
		this.busid = busid;
		this.driverid = driverid;
		this.conductorid = conductorid;
		this.scheduledate = scheduledate;
		this.scheduleday = scheduleday;
		this.departuretime = departuretime;
		this.arrivaltime = arrivaltime;
	}

	public int getScheduleid() {
		return scheduleid;
	}

	public void setScheduleid(int scheduleid) {
		this.scheduleid = scheduleid;
	}

	public Route getRouteid() {
		return routeid;
	}

	public void setRouteid(Route routeid) {
		this.routeid = routeid;
	}

	public Bus getBusid() {
		return busid;
	}

	public void setBusid(Bus busid) {
		this.busid = busid;
	}

	public Driver getDriverid() {
		return driverid;
	}

	public void setDriverid(Driver driverid) {
		this.driverid = driverid;
	}

	public Conductor getConductorid() {
		return conductorid;
	}

	public void setConductorid(Conductor conductorid) {
		this.conductorid = conductorid;
	}

	public Date getScheduledate() {
		return scheduledate;
	}

	public void setScheduledate(Date scheduledate) {
		this.scheduledate = scheduledate;
	}

	public String getScheduleday() {
		return scheduleday;
	}

	public void setScheduleday(String scheduleday) {
		this.scheduleday = scheduleday;
	}

	public Date getDeparturetime() {
		return departuretime;
	}

	public void setDeparturetime(Date departuretime) {
		this.departuretime = departuretime;
	}

	public Date getArrivaltime() {
		return arrivaltime;
	}

	public void setArrivaltime(Date arrivaltime) {
		this.arrivaltime = arrivaltime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrivaltime == null) ? 0 : arrivaltime.hashCode());
		result = prime * result + ((busid == null) ? 0 : busid.hashCode());
		result = prime * result + ((conductorid == null) ? 0 : conductorid.hashCode());
		result = prime * result + ((departuretime == null) ? 0 : departuretime.hashCode());
		result = prime * result + ((driverid == null) ? 0 : driverid.hashCode());
		result = prime * result + ((routeid == null) ? 0 : routeid.hashCode());
		result = prime * result + ((scheduledate == null) ? 0 : scheduledate.hashCode());
		result = prime * result + ((scheduleday == null) ? 0 : scheduleday.hashCode());
		result = prime * result + scheduleid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schedule other = (Schedule) obj;
		if (arrivaltime == null) {
			if (other.arrivaltime != null)
				return false;
		} else if (!arrivaltime.equals(other.arrivaltime))
			return false;
		if (busid == null) {
			if (other.busid != null)
				return false;
		} else if (!busid.equals(other.busid))
			return false;
		if (conductorid == null) {
			if (other.conductorid != null)
				return false;
		} else if (!conductorid.equals(other.conductorid))
			return false;
		if (departuretime == null) {
			if (other.departuretime != null)
				return false;
		} else if (!departuretime.equals(other.departuretime))
			return false;
		if (driverid == null) {
			if (other.driverid != null)
				return false;
		} else if (!driverid.equals(other.driverid))
			return false;
		if (routeid == null) {
			if (other.routeid != null)
				return false;
		} else if (!routeid.equals(other.routeid))
			return false;
		if (scheduledate == null) {
			if (other.scheduledate != null)
				return false;
		} else if (!scheduledate.equals(other.scheduledate))
			return false;
		if (scheduleday == null) {
			if (other.scheduleday != null)
				return false;
		} else if (!scheduleday.equals(other.scheduleday))
			return false;
		if (scheduleid != other.scheduleid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Schedule [scheduleid=" + scheduleid + ", routeid=" + routeid + ", busid=" + busid + ", driverid="
				+ driverid + ", conductorid=" + conductorid + ", scheduledate=" + scheduledate + ", scheduleday="
				+ scheduleday + ", departuretime=" + departuretime + ", arrivaltime=" + arrivaltime + "]";
	}
	
}