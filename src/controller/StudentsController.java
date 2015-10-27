package controller;

//import br.com.studentsmanager.data.StudentsRepository;
import interfaces.InterfaceStudent;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import model.MastersDegreeStudent;
import model.PhDStudent;
import service.StudentRegistration;
import util.StudentTypeEnum;
import data.StudentsRepository;


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
        if(studentType.equals(StudentTypeEnum.MASTERS_DEGREE)){
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
