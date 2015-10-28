package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 * @author Clayton Veras, Clayton Santos & Marcos Alexandre
 */
@Entity
@Table(name="ARTICLE")
public class Article implements Serializable {

	private static final long serialVersionUID = -7067758519450271490L;

	@Column(name = "TITTLE")
	@Enumerated(EnumType.STRING)
	protected String tittle;
	
	@Column(name = "SUBJECT")
	@Enumerated(EnumType.STRING)
	protected String subject;
	
	@Column(name = "PUBLICATION_DATE")
	@Enumerated(EnumType.STRING)
	protected Date publication_date;
	
	@Column(name = "PUBLISHING_EVENT")
	@Enumerated(EnumType.STRING)
	protected Event publishing_event;

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getPublication_date() {
		return publication_date;
	}

	public void setPublication_date(Date publication_date) {
		this.publication_date = publication_date;
	}

	public Event getPublishing_event() {
		return publishing_event;
	}

	public void setPublishing_event(Event publishing_event) {
		this.publishing_event = publishing_event;
	}
	
}
