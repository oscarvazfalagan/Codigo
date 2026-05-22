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
public class DoubleBooking extends Booking {

    private Player[][] teams = new Player[2][2];

    public DoubleBooking(Date date, String hour, PadelCourt court) {
        super(date, hour, court);
    }

    public DoubleBooking(Player[][] teams, Date date, String hour, PadelCourt court) {
        super(date, hour, court);
        this.teams = teams;
    }

    @Override
    public boolean isCompleted() {
        for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams[i].length; j++) {
                if (teams[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean containsPlayer(String id) {
        for (Player[] team : teams) {
            for (Player team1 : team) {
                if (team1.getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addPlayer(Player player, int teamNumber) {
        for (int j = 0; j < teams[teamNumber].length; j++) {
            if (teams[teamNumber][j] == null) {
                teams[teamNumber][j] = player;
            }
        }

    }

    @Override
    public String getDescription() {
        for (Player[] team : teams) {
            String description = super.getDescription() + "\n Xogadores : ";
            for (Player[] : teams) {
                if (team != null) {
                    description += p.getName() + Double.toString(p.getScore()) + "\n";
                } else {
                    description += "- PENDENTE \n";
                }
            }
        }

        return description;
        return super.getDescription() + "\nXogadores : Equipo 1 :" + teams[1][1].getName() + " " + teams[1][2].getName() + "Equipo 2 : " + teams[2][1].getName() + " " + teams[2][2].getName();
    }
}
