package com.bus.app.pojo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Conductor {

	@Id
	private int conductorid;
	
	private String conductorfirstname;
	
	private String conductorlastname;
	
	private String conductorphone;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Stop conductorlocation;

	public Conductor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Conductor(int conductorid, String conductorfirstname, String conductorlastname, String conductorphone,
			Stop conductorlocation) {
		super();
		this.conductorid = conductorid;
		this.conductorfirstname = conductorfirstname;
		this.conductorlastname = conductorlastname;
		this.conductorphone = conductorphone;
		this.conductorlocation = conductorlocation;
	}

	public int getConductorid() {
		return conductorid;
	}

	public void setConductorid(int conductorid) {
		this.conductorid = conductorid;
	}

	public String getConductorfirstname() {
		return conductorfirstname;
	}

	public void setConductorfirstname(String conductorfirstname) {
		this.conductorfirstname = conductorfirstname;
	}

	public String getConductorlastname() {
		return conductorlastname;
	}

	public void setConductorlastname(String conductorlastname) {
		this.conductorlastname = conductorlastname;
	}

	public String getConductorphone() {
		return conductorphone;
	}

	public void setConductorphone(String conductorphone) {
		this.conductorphone = conductorphone;
	}

	public Stop getConductorlocation() {
		return conductorlocation;
	}

	public void setConductorlocation(Stop conductorlocation) {
		this.conductorlocation = conductorlocation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conductorfirstname == null) ? 0 : conductorfirstname.hashCode());
		result = prime * result + conductorid;
		result = prime * result + ((conductorlastname == null) ? 0 : conductorlastname.hashCode());
		result = prime * result + ((conductorlocation == null) ? 0 : conductorlocation.hashCode());
		result = prime * result + ((conductorphone == null) ? 0 : conductorphone.hashCode());
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
		Conductor other = (Conductor) obj;
		if (conductorfirstname == null) {
			if (other.conductorfirstname != null)
				return false;
		} else if (!conductorfirstname.equals(other.conductorfirstname))
			return false;
		if (conductorid != other.conductorid)
			return false;
		if (conductorlastname == null) {
			if (other.conductorlastname != null)
				return false;
		} else if (!conductorlastname.equals(other.conductorlastname))
			return false;
		if (conductorlocation == null) {
			if (other.conductorlocation != null)
				return false;
		} else if (!conductorlocation.equals(other.conductorlocation))
			return false;
		if (conductorphone == null) {
			if (other.conductorphone != null)
				return false;
		} else if (!conductorphone.equals(other.conductorphone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Conductor [conductorid=" + conductorid + ", conductorfirstname=" + conductorfirstname
				+ ", conductorlastname=" + conductorlastname + ", conductorphone=" + conductorphone
				+ ", conductorlocation=" + conductorlocation + "]";
	}
	
}