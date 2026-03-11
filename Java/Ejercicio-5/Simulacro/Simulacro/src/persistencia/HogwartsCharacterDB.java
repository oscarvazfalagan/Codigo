/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.lang.reflect.Array;
import java.util.ArrayList;
import model.HogwartsCharacter;
import model.Subject;

/**
 *
 * @author daw1al13
 */
public class HogwartsCharacterDB {
    private final static ArrayList<HogwartsCharacter> characters = new ArrayList<>();

    public static ArrayList<HogwartsCharacter> getHogwartsCharacters() {
        return characters;
    }
    
        public final static HogwartsCharacter findByCode(String code){
        HogwartsCharacter character=null;
        
        for(int i=0;i<characters.size();i++){
            if (characters.get(i).getCodigoHowarts().equals(code)){
               character= characters.get(i);
            }
        }
        return character;
    }
  
   
}
