/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author clayton veras & clayton santos
 */
public enum LanguagesEnum {
    
    ENGLISH ("Inglês"),
    FRENCH ("Francês"), 
    GERMAN ("Alemão"), 
    ITALIAN ("Italiano");
    
    private String description;

    public String getDescription() {
            return description;
    }

    LanguagesEnum(String description) {
            this.description = description;
    }
	
    
}
