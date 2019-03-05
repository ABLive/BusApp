package com.bus.app.pojo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Bus {

	@Id
	private int busid;
	
	private String busno;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Stop buslocation;

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(int busid, String busno, Stop buslocation) {
		super();
		this.busid = busid;
		this.busno = busno;
		this.buslocation = buslocation;
	}

	public int getBusid() {
		return busid;
	}

	public void setBusid(int busid) {
		this.busid = busid;
	}

	public String getBusno() {
		return busno;
	}

	public void setBusno(String busno) {
		this.busno = busno;
	}

	public Stop getBuslocation() {
		return buslocation;
	}

	public void setBuslocation(Stop buslocation) {
		this.buslocation = buslocation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + busid;
		result = prime * result + ((buslocation == null) ? 0 : buslocation.hashCode());
		result = prime * result + ((busno == null) ? 0 : busno.hashCode());
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
		Bus other = (Bus) obj;
		if (busid != other.busid)
			return false;
		if (buslocation == null) {
			if (other.buslocation != null)
				return false;
		} else if (!buslocation.equals(other.buslocation))
			return false;
		if (busno == null) {
			if (other.busno != null)
				return false;
		} else if (!busno.equals(other.busno))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bus [busid=" + busid + ", busno=" + busno + ", buslocation=" + buslocation + "]";
	}
	
}