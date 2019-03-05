package com.bus.app.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stop {

	@Id
	private int stopid;
	
	private String stopname;
	
	private String stoplocation;

	public Stop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stop(int stopid, String stopname, String stoplocation) {
		super();
		this.stopid = stopid;
		this.stopname = stopname;
		this.stoplocation = stoplocation;
	}

	public int getStopid() {
		return stopid;
	}

	public void setStopid(int stopid) {
		this.stopid = stopid;
	}

	public String getStopname() {
		return stopname;
	}

	public void setStopname(String stopname) {
		this.stopname = stopname;
	}

	public String getStoplocation() {
		return stoplocation;
	}

	public void setStoplocation(String stoplocation) {
		this.stoplocation = stoplocation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stopid;
		result = prime * result + ((stoplocation == null) ? 0 : stoplocation.hashCode());
		result = prime * result + ((stopname == null) ? 0 : stopname.hashCode());
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
		Stop other = (Stop) obj;
		if (stopid != other.stopid)
			return false;
		if (stoplocation == null) {
			if (other.stoplocation != null)
				return false;
		} else if (!stoplocation.equals(other.stoplocation))
			return false;
		if (stopname == null) {
			if (other.stopname != null)
				return false;
		} else if (!stopname.equals(other.stopname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Stop [stopid=" + stopid + ", stopname=" + stopname + ", stoplocation=" + stoplocation + "]";
	}

}