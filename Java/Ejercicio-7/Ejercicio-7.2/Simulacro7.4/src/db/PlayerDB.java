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

    public static Player findByIdAndPassword(String id, String contrasinal) {
        Player player = PadelManagerDB.getPlayers().get(id);
        if (player != null && player.getPassword().equals(contrasinal)) {
            return player;
        }
        return null;
    }
}
