/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author daw1al13
 */
public abstract class Booking {
    protected Date date;

    public Booking(Date date, String hour, PadelCourt court) {
        this.date = date;
        this.hour = hour;
        this.court = court;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public PadelCourt getCourt() {
        return court;
    }

    public void setCourt(PadelCourt court) {
        this.court = court;
    }
    protected String hour;
    protected PadelCourt court;
    
    public abstract boolean isCompleted();
    public abstract boolean containsPlayer(String id);
    public String getDescription(){
        String CompletedMessage="";
        if(isCompleted()){
            CompletedMessage="""
                             Reserva Completas :
                             """+"Data:"+new SimpleDateFormat("dd/MM/yyyy").format(date)+"Hora:"+hour+"Pista:"+court.getNumber();
        }else{
            CompletedMessage="""
                             Reserva Incompletas :
                             """+"Data:"+new SimpleDateFormat("dd/MM/yyyy").format(date)+"Hora:"+hour+"Pista:"+court.getNumber();;
        }
        return CompletedMessage;
        
    }
    
}
