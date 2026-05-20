/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.util.ArrayList;
import java.util.HashMap;
import model.Player;
import model.PadelCourt;
import model.Booking;

/**
 *
 * @author daw1al13
 */
public class PadelManagerDB {
    private static HashMap<String,Player> players = new HashMap<String,Player>();
    private static ArrayList<PadelCourt> court = new ArrayList<PadelCourt>();
     private static ArrayList<Booking> bookings = new ArrayList<Booking>();

    public static HashMap<String, Player> getPlayers() {
        return players;
    }

    public static ArrayList<PadelCourt> getCourt() {
        return court;
    }

    public static ArrayList<Booking> getBookings() {
        return bookings;
    }
            
}
