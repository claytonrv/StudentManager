/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import util.EvaluationEnum;
import util.LanguagesEnum;
import interfaces.InterfaceStudent;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author clayton veras & clayton santos
 */
public abstract class Student implements InterfaceStudent{
    
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID")
    protected Long id;  
	
    @Column(name = "NAME")
    protected String name;
    
    @Column(name = "ENROLLMENT")
    protected long enrollment;
    
    @Column(name = "DEADLINE_CONCLUSION")
    protected int dead_line_to_conclusion;
    
    @Column(name = "LANGUAGES")
    @Enumerated(EnumType.STRING)
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.MERGE)
    protected List<LanguagesEnum> language_proficiency;
    
    @Column(name = "COURSE")
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.MERGE)
    protected String course;
    
    @Column(name = "INSTITUITION")
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.MERGE)
    protected Institution institution;
    
    @Column(name = "QUALIFICATION_EXAMINATION")
    @Enumerated(EnumType.STRING)
    protected EvaluationEnum qualification_examination;
    
    @Override
    public String getName(){
        return this.name;
    }
    
    @Override
    public void setName(String name){
        this.name=name;
    }
    
    @Override
    public long getEnrollment(){
        return this.enrollment;
    }
    
    @Override
    public void setEnrollment(long enrollment){
        this.enrollment = enrollment;
    }
    
    @Override
    public int getDeadlineConclusion(){
        return this.dead_line_to_conclusion;
    }
    
    @Override
    public abstract void setDeadlineConclusion(int deadlineConclusion);
    
    @Override
    public List<LanguagesEnum> getLanguageProficiency(){
        return this.language_proficiency;
    }
    
    @Override
    public void setLanguageProficiency(List<LanguagesEnum> language_proficiency){
        this.language_proficiency = language_proficiency;
    }
    
    @Override
    public Institution getInstitution(){
        return this.institution;
    }
    
    @Override
    public void setInstitution(Institution institution){
        this.institution = institution;
    }
    
    @Override
    public EvaluationEnum getQualificationExamination(){
        return this.qualification_examination;
    }
    
    @Override
    public void setQualificationExamination(EvaluationEnum evaluation){
        this.qualification_examination = evaluation;
    }

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
    
}
