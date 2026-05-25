/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import db.BookingDB;
import db.PadelCourtDB;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import model.Booking;
import model.PadelCourt;
import model.Player;
import model.SingleBookin;
import vista.SessionView;

/**
 *
 * @author oscar
 */
public class SessionController {

    private SessionView myView;
    private Player sessionPlayer;

    public SessionController(Player sessionPlayer) {
        this.sessionPlayer = sessionPlayer;
        myView = new SessionView(this);
    }

    public void loadSession() {

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);

        Date currentDate = cal.getTime();
        ArrayList<Booking> reservas = BookingDB.findByUserAndDate(sessionPlayer.getId(), currentDate);
        myView.showSessionMenu(reservas);

    }

    public Player getSessionPlayer() {
        return sessionPlayer;
    }

    public void createBoooking(Date fecha) {
        ArrayList<PadelCourt> pistas = PadelCourtDB.getAllcourts();
        for (int i = 0; i < pistas.size(); i++) {
            pistas.get(i).getBookingHours();
        }
    }

    public void completeBooking(Date fecha, String hora, PadelCourt pista) {
        Booking newBoking;

        if (pista.getType() == PadelCourt.SINGLE) {
            newBoking = new SingleBookin(fecha, hora, pista);
            ((SingleBookin) newBoking).addPlayer(this.sessionPlayer);
        } else {
            newBoking = new SingleBookin(fecha, hora, pista);
            ((SingleBookin) newBoking).addPlayer(this.sessionPlayer);
        }
        BookingDB.save(newBoking);
        this.loadSession();
    }

    public void joinMatch() {
        this.loadSession();
    }

}
