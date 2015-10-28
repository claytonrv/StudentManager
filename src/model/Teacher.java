package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Clayton Veras, Clayton Santos & Marcos Alexandre
 */
@Entity
@Table(name="TEACHER")
public class Teacher implements Serializable {
	
	private static final long serialVersionUID = -5203762234314111498L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID")
    protected Long id;
	
	@Column(name="ENROLLMENT")
	private int enrollment;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DEPARTMENT")
	private String department;
	
	@Column(name="ROOM")
	private String room;

	public int getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(int enrollment) {
		this.enrollment = enrollment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public Long getId() {
		return id;
	}
	
}
