/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import util.EvaluationEnum;
import util.LanguagesEnum;
import model.Institution;
import java.util.List;

/**
 * @author Clayton Veras, Clayton Santos & Marcos Alexandre
 */
public interface InterfaceStudent {
    
    public Long getId();
    public String getName();
    public void setName(String name);
    public long getEnrollment();    
    public void setEnrollment(long enrollment);
    public int getDeadlineConclusion();
    public void setDeadlineConclusion(int deadlineConclusion);
    public List<LanguagesEnum> getLanguageProficiency();
    public void setLanguageProficiency(List<LanguagesEnum> language_proficiency);
    public Institution getInstitution();
    public void setInstitution(Institution institution);
    public EvaluationEnum getQualificationExamination();
    public void setQualificationExamination(EvaluationEnum evaluation);
    
}