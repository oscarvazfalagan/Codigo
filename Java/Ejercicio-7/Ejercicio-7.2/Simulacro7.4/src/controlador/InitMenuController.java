/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import db.PadelManagerDB;
import vista.InitMenuView;
import db.PlayerDB;
import model.PadelCourt;
import model.Player;

/**
 *
 * @author daw1al13
 */

public class InitMenuController {

    private InitMenuView myView;

    public InitMenuController() {
        myView = new InitMenuView(this);
    }

    public void initApp() {
        while(!myView.showloginMenu()){
            
        }
    }

    public void login(String id, String contrasinal) {
        

    Player player = PlayerDB.findByIdAndPassword(id, contrasinal);

    if(player != null) {
        SessionController session = new SessionController(player);
        session.loadSession();

    } else {

        myView.showInvalidUser();
    }
    }

    public static void main(String[] args) {
        Player player1 = new Player("luisf", "abc", "Luis Fdez", 2.5);
        Player player2 = new Player("maria", "abc", "Maria Insua", 2.83);
        PadelCourt court1 = new PadelCourt(1, PadelCourt.DOUBLE, new String[]{"9:00", "11:00", "13:00", "16:00"});
        PadelCourt court2 = new PadelCourt(2, PadelCourt.SINGLE, new String[]{"9:00", "11:00", "13:00", "16:00"});
        PadelCourt court3 = new PadelCourt(3, PadelCourt.DOUBLE, new String[]{"9:00", "11:00"});

        PadelManagerDB.getPlayers().put(player1.getId(), player1);
        PadelManagerDB.getPlayers().put(player2.getId(), player2);
        PadelManagerDB.getCourts().add(court1);
        PadelManagerDB.getCourts().add(court2);
        PadelManagerDB.getCourts().add(court3);

        InitMenuController myController = new InitMenuController();
        myController.initApp();
    }
}
