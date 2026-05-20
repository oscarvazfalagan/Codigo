/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.util.ArrayList;
import model.PadelCourt;

/**
 *
 * @author daw1al13
 */
public class PadelCourtDB {

    public static ArrayList<PadelCourt> getAllcourts() {
        return PadelManagerDB.getCourt();
    }
}
