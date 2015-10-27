/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.studentsmanager.model;

import br.com.studentsmanager.util.EvaluationEnum;
import br.com.studentsmanager.util.LanguagesEnum;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import br.com.studentsmanager.interfaces.InterfaceStudent;

/**
 *
 * @author clayton veras & clayton santos
 */
public abstract class Student implements InterfaceStudent{
    
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
    
}
