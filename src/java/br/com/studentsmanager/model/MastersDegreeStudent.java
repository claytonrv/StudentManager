/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.studentsmanager.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author clayton
 */
@Entity
@Table(name = "MASTERS_DEGREE_STUDENT")
public class MastersDegreeStudent extends Student implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    public Long getId(){
        return this.id;
    }

    @Override
    public void setDeadlineConclusion(int deadlineConclusion) {
        if(deadlineConclusion==24){
            this.dead_line_to_conclusion = deadlineConclusion;
        }
    }
}
