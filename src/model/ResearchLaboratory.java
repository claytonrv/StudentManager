package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RESEARCH_LABORATORY")
public class ResearchLaboratory implements Serializable{
	
	private static final long serialVersionUID = 6845019321950832870L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID")
    protected Long id;

	@Column(name="RESEARCH_AREA")
	private String research_area;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="LOCATION")
	private String location;
	
	@Column(name="DEPARTMENT")
	private String department;

	public Long getId() {
		return id;
	}
	
	public String getResearch_area() {
		return research_area;
	}

	public void setResearch_area(String research_area) {
		this.research_area = research_area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
