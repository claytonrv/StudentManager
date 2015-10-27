/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.studentsmanager.controller;

//import br.com.studentsmanager.data.StudentsRepository;
import br.com.studentsmanager.data.StudentsRepository;
import br.com.studentsmanager.interfaces.InterfaceStudent;
import br.com.studentsmanager.model.MastersDegreeStudent;
import br.com.studentsmanager.model.PhDStudent;
import br.com.studentsmanager.service.StudentRegistration;
import br.com.studentsmanager.util.StudentTypeEnum;
import static br.com.studentsmanager.util.StudentTypeEnum.*;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author clayton veras & clayton santos
 */
@ManagedBean
@ViewScoped
public class StudentsController {
    
    @Inject
    private StudentsRepository studentsRepository;
    
    @Inject
    private StudentRegistration studentRegistration;
    
    private List<MastersDegreeStudent> mastersDegreeStudents;
    private List<PhDStudent> phdStudents;
    private InterfaceStudent student;
    private StudentTypeEnum studentType;
    
    @PostConstruct
    public void init(){
        phdStudents = studentsRepository.findAllPhDStudentOrderedByName();
        mastersDegreeStudents = studentsRepository.findAllMasterDegreestudentOrderedByName();
    }
    
    
    public void setStudentType(StudentTypeEnum studentTypeEnum){
        this.studentType = studentTypeEnum;
        if(studentType.equals(MASTERS_DEGREE)){
            this.newMastersDegreeStudentEntity();
        }else {
            this.newPhdStudentEntity();
        }
    }
    
    public void register(){
        try{
            if(student.getId() == null){
                studentRegistration.insert(student);
            }else {
                studentRegistration.update(student);
            }
        }catch(Exception e){
            
        }
    }
    
    public void newPhdStudentEntity(){
        student = new PhDStudent();
    }
    
    public void newMastersDegreeStudentEntity(){
        student = new MastersDegreeStudent();
    }
    
    public List<MastersDegreeStudent> getMastersDegreeStudents(){
        return this.mastersDegreeStudents;
    }
    
    public List<PhDStudent> getPhDStudents(){
        return this.phdStudents;
    }
    
}
