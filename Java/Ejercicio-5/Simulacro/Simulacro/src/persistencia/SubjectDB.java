/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.ArrayList;

import model.Subject;

/**
 *
 * @author daw1al13
 */
public class SubjectDB {
     private final static ArrayList<Subject> subjects = new ArrayList<>();

    public static ArrayList<Subject> getSubjects() {
        return subjects;
    }
     
    public final static Subject findByCode(String code){
        Subject subject=null;
        
        for(int i=0;i<subjects.size();i++){
            if (subjects.get(i).getCodigoMateria().equals(code)){
               subject=subjects.get(i);
            }
        }
        return subject;
    }
}
