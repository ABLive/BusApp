package com.bus.app.pojo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Driver {

	@Id
	private int driverid;
	
	private String driverfirstname;
	
	private String driverlastname;
	
	private String driverphone;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Stop driverlocation;

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Driver(int driverid, String driverfirstname, String driverlastname, String driverphone, Stop driverlocation) {
		super();
		this.driverid = driverid;
		this.driverfirstname = driverfirstname;
		this.driverlastname = driverlastname;
		this.driverphone = driverphone;
		this.driverlocation = driverlocation;
	}

	public int getDriverid() {
		return driverid;
	}

	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}

	public String getDriverfirstname() {
		return driverfirstname;
	}

	public void setDriverfirstname(String driverfirstname) {
		this.driverfirstname = driverfirstname;
	}

	public String getDriverlastname() {
		return driverlastname;
	}

	public void setDriverlastname(String driverlastname) {
		this.driverlastname = driverlastname;
	}

	public String getDriverphone() {
		return driverphone;
	}

	public void setDriverphone(String driverphone) {
		this.driverphone = driverphone;
	}

	public Stop getDriverlocation() {
		return driverlocation;
	}

	public void setDriverlocation(Stop driverlocation) {
		this.driverlocation = driverlocation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((driverfirstname == null) ? 0 : driverfirstname.hashCode());
		result = prime * result + driverid;
		result = prime * result + ((driverlastname == null) ? 0 : driverlastname.hashCode());
		result = prime * result + ((driverlocation == null) ? 0 : driverlocation.hashCode());
		result = prime * result + ((driverphone == null) ? 0 : driverphone.hashCode());
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
		Driver other = (Driver) obj;
		if (driverfirstname == null) {
			if (other.driverfirstname != null)
				return false;
		} else if (!driverfirstname.equals(other.driverfirstname))
			return false;
		if (driverid != other.driverid)
			return false;
		if (driverlastname == null) {
			if (other.driverlastname != null)
				return false;
		} else if (!driverlastname.equals(other.driverlastname))
			return false;
		if (driverlocation == null) {
			if (other.driverlocation != null)
				return false;
		} else if (!driverlocation.equals(other.driverlocation))
			return false;
		if (driverphone == null) {
			if (other.driverphone != null)
				return false;
		} else if (!driverphone.equals(other.driverphone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Driver [driverid=" + driverid + ", driverfirstname=" + driverfirstname + ", driverlastname="
				+ driverlastname + ", driverphone=" + driverphone + ", driverlocation=" + driverlocation + "]";
	}
	
}