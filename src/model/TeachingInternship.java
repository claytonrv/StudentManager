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
@Table(name = "TEACHING_INTERNSHIP")
public class TeachingInternship implements Serializable {

	private static final long serialVersionUID = 341950836354781119L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID")
    protected Long id;
	
	@Column(name="DISCIPLINE_NAME")
	protected String discipline_name;
	
	@Column(name="WAIVED_HOURS")
	protected int waived_hours;

	public String getDiscipline_name() {
		return discipline_name;
	}

	public void setDiscipline_name(String discipline_name) {
		this.discipline_name = discipline_name;
	}

	public int getWaived_hours() {
		return waived_hours;
	}

	public void setWaived_hours(int waived_hours) {
		this.waived_hours = waived_hours;
	}

	public Long getId() {
		return id;
	}
	
	
	

}
