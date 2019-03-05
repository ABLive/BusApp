package com.bus.app.pojo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Route {

	@Id
	private int routeid;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Stop source;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Stop destination;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Stop via;

	public Route() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Route(int routeid, Stop source, Stop destination, Stop via) {
		super();
		this.routeid = routeid;
		this.source = source;
		this.destination = destination;
		this.via = via;
	}

	public int getRouteid() {
		return routeid;
	}

	public void setRouteid(int routeid) {
		this.routeid = routeid;
	}

	public Stop getSource() {
		return source;
	}

	public void setSource(Stop source) {
		this.source = source;
	}

	public Stop getDestination() {
		return destination;
	}

	public void setDestination(Stop destination) {
		this.destination = destination;
	}

	public Stop getVia() {
		return via;
	}

	public void setVia(Stop via) {
		this.via = via;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + routeid;
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((via == null) ? 0 : via.hashCode());
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
		Route other = (Route) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (routeid != other.routeid)
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (via == null) {
			if (other.via != null)
				return false;
		} else if (!via.equals(other.via))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Route [routeid=" + routeid + ", source=" + source + ", destination=" + destination + ", via=" + via
				+ "]";
	}
	
}