/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author clayton
 */
public enum EvaluationEnum {
    
    APPROVED ("Aprovado"), 
    DISAPPROVED ("Reprovado"), 
    APPROVED_WITH_SHORTCIMINGS ("Aprovado com pendências");
    
     private String description;

    public String getDescription() {
        return description;
    }

    EvaluationEnum(String description) {
        this.description = description;
    }
    
}
