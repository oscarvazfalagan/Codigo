/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import vista.InitMenuView;
import db.PlayerDB;
/**
 *
 * @author daw1al13
 */
public class InitMenuController {
    private InitMenuView myView;

    public InitMenuController() {
        myView = new InitMenuView();
    }
    public void initApp(){
        myView.showloginMenu();
    }
    
    public void login(String id,String contrasinal){
        PlayerDB.findByIdAndPassword(id, contrasinal);
    }
}
