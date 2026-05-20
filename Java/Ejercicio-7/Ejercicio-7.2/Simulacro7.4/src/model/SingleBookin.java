/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author daw1al13
 */
public class SingleBookin extends Booking {

    private Player[] players = new Player[2];

    public SingleBookin(Date date, String hour, PadelCourt court) {
        super(date, hour, court);
    }

    @Override
    public boolean isCompleted() {
        int numberOfPlayers = 0;
        boolean complete = false;
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                numberOfPlayers++;
            }
        }
        if (numberOfPlayers == players.length) {
            complete = true;
        }
        return complete;
    }

    @Override
    public boolean containsPlayer(String id) {
        boolean contains = false;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getId() == id) {
                contains = true;
            }
        }
        return contains;
    }

    public void addPlayer(Player player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                players[i] = player;
            }
        }
    }

    @Override
    public String getDescription() {
        
        
        for (int i = 0; i < players.length; i++) {
            if (players[i].getName()==null) {
                players[i].setName("PENDENTE");
            }
        }
        return super.getDescription() + "\nXogadores : "+players[1].getName()+" "+players[2].getName();
    }

    
    
}
