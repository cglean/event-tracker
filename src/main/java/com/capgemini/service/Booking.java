package com.capgemini.service;

public class Booking {

	private String name;
	
	private Event event;

	
	public Booking(String name, Event event) {
		super();
		this.name = name;
		this.event = event;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
	
	
	
}
