package model;

import interfaces.InterfaceStudent;

import java.util.Date;
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

import util.EvaluationEnum;
import util.LanguagesEnum;

/**
 * @author Clayton Veras, Clayton Santos & Marcos Alexandre
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
    
    @Column(name="START_DATE")
    protected Date start_date;
    
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
    
    @Column(name = "ARTICLE_PUBLICATIONS")
    @Enumerated(EnumType.STRING)
    protected List<Article> article_publications;
    
    @Column(name = "ADVISOR_TEACHER")
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.MERGE)
    protected Teacher advisor_teacher;
    
    @Column(name = "RESEARCH_LABORATORY")
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.MERGE)
    protected ResearchLaboratory research_laboratory;
    
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
    public abstract int getDeadlineConclusion();
    
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

	public List<Article> getArticle_publications() {
		return article_publications;
	}

	public abstract void setArticle_publications(List<Article> article_publications);

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Teacher getAdvisor_teacher() {
		return advisor_teacher;
	}

	public void setAdvisor_teacher(Teacher advisor_teacher) {
		this.advisor_teacher = advisor_teacher;
	}

	public ResearchLaboratory getResearch_laboratory() {
		return research_laboratory;
	}

	public void setResearch_laboratory(ResearchLaboratory research_laboratory) {
		this.research_laboratory = research_laboratory;
	}
    
}
