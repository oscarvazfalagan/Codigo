/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2_4_5;
/**
 *
 * @author daw1al13
 */
public class StringComparator {
    
    
    
    
    
    private String string1;
    private String string2;
    private String string3;
    

    public StringComparator(String string1, String string2, String string3) {
        this.string1 = string1;
        this.string2 = string2;
        this.string3 = string3;
    }


    
    
    
    
    
    public String getBigger(){
     
       if (string1.length() > string2.length() & string1.length() > string3.length()){
           return string1;
       }
       if (string2.length() > string1.length() & string2.length() > string3.length()){
           return string2;
       }
       if (string3.length() > string2.length() & string3.length() > string1.length()){
           return string3;
       }
       return "no existe";
    }
    
}

