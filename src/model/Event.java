package model;

import java.util.Date;

/**
 * @author Clayton Veras, Clayton Santos & Marcos Alexandre
 */
public class Event {
	
	private String event_location;
	private Date event_date;
	private String event_type;
	
	
	public Event(String location, Date date, String type){
		this.event_location = location;
		this.event_date = date;
		this.event_type = type;
	}


	public String getEvent_location() {
		return event_location;
	}


	public void setEvent_location(String event_location) {
		this.event_location = event_location;
	}


	public Date getEvent_date() {
		return event_date;
	}


	public void setEvent_date(Date event_date) {
		this.event_date = event_date;
	}


	public String getEvent_type() {
		return event_type;
	}


	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}
	
	
}
