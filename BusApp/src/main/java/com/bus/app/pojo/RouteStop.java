package com.bus.app.pojo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "routestop")
public class RouteStop {

	@EmbeddedId
	private RouteStopId routeStopId; 
	
	private String sequence;

	public RouteStopId getRouteStopId() {
		return routeStopId;
	}

	public void setRouteStopId(RouteStopId routeStopId) {
		this.routeStopId = routeStopId;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public RouteStop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RouteStop(RouteStopId routeStopId, String sequence) {
		super();
		this.routeStopId = routeStopId;
		this.sequence = sequence;
	}
	
}