package com.bus.app.pojo;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Embeddable
public class RouteStopId implements Serializable {

	@ManyToOne(fetch = FetchType.EAGER)
	private Route routeid;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Stop stopid;
	
	public RouteStopId() {
		
	}

	public RouteStopId(Route routeid, Stop stopid) {
		super();
		this.routeid = routeid;
		this.stopid = stopid;
	}

	public Route getRouteid() {
		return routeid;
	}

	public void setRouteid(Route routeid) {
		this.routeid = routeid;
	}

	public Stop getStopid() {
		return stopid;
	}

	public void setStopid(Stop stopid) {
		this.stopid = stopid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((routeid == null) ? 0 : routeid.hashCode());
		result = prime * result + ((stopid == null) ? 0 : stopid.hashCode());
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
		RouteStopId other = (RouteStopId) obj;
		if (routeid == null) {
			if (other.routeid != null)
				return false;
		} else if (!routeid.equals(other.routeid))
			return false;
		if (stopid == null) {
			if (other.stopid != null)
				return false;
		} else if (!stopid.equals(other.stopid))
			return false;
		return true;
	}
	
}