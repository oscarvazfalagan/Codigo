/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package view;

import java.util.ArrayList;
import model.HogwartsCharacter;
import model.Subject;

/**
 *
 * @author daw1al13
 */
public interface HogwartsView {
    

    public void setCharacters(ArrayList<HogwartsCharacter> characters);
    
    public void setSubjects(ArrayList<Subject> subjects);
    
    public void showMenu();
    
    public void showCharacterData(HogwartsCharacter character);
    
    public void showSubjectData(Subject subject);
    
    public void showUnderConstructionMessage(String operationName);
    
}
