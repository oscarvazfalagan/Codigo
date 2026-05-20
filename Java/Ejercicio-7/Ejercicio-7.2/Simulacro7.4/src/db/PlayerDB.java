/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import model.Player;
/**
 *
 * @author daw1al13
 */
public class PlayerDB {
    public static Player findByIdAndPassword(String id,String Contrasinal){
        for(int i=0;i<PadelManagerDB.getPlayers().size();i++){
           if(PadelManagerDB.getPlayers().get(i).getId().equals(id) && PadelManagerDB.getPlayers().get(i).getPassword().equals(Contrasinal)){
               return PadelManagerDB.getPlayers().get(i);
           }        
        }
        return null;
    }
}
