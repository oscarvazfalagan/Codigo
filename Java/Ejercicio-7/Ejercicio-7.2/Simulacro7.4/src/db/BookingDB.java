/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.util.ArrayList;
import java.util.Date;
import model.Booking;
/**
 *
 * @author daw1al13
 */
public class BookingDB {
    public static ArrayList<Date> findByDate(Date data){
        ArrayList<Date> fechasReservas= new ArrayList<Date>();
        for(int i=0;i<PadelManagerDB.getBookings().size();i++){
            if(PadelManagerDB.getBookings().get(i).getDate()==data){
                fechasReservas.add(data);
            }
        }
        return fechasReservas;        
    }
    
    public static ArrayList<Date> findByUserAndDate(String id,Date data){
        ArrayList<Date> fechasReservas= new ArrayList<Date>();
       for(int i=0;i<PadelManagerDB.getBookings().size();i++){
            if(PadelManagerDB.getBookings().get(i).containsPlayer(id)){
               if(PadelManagerDB.getBookings().get(i).getDate().after(data)||PadelManagerDB.getBookings().get(i).getDate().equals(data)){
                   fechasReservas.add(data);
               }
            }
        }
       return fechasReservas;
    }
    
    public static void save(Booking reserva){
        PadelManagerDB.getBookings().add(reserva);
    }
}
