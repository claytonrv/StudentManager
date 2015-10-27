/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.studentsmanager.util;

/**
 *
 * @author clayton
 */
public enum StudentTypeEnum {
    
    MASTERS_DEGREE ("Mestrando"), 
    PHD ("Doutorando");
    
    private String description;

    public String getDescription() {
        return description;
    }

    StudentTypeEnum(String description) {
        this.description = description;
    }
    
}
