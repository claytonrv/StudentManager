/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import interfaces.InterfaceStudent;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author clayton
 */
@Stateless
public class StudentRegistration extends AbstractRegistration<InterfaceStudent>{
    
    
    @Inject 
    private EntityManager em;
    
    @Override
    public void remove(InterfaceStudent student) throws Exception {
            log.info("Removing" + student);
            InterfaceStudent studentToBeRemoved = em.find(InterfaceStudent.class, student.getId());
            em.remove(studentToBeRemoved);
            entityEventSrc.fire(studentToBeRemoved);
    }
}
