/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author daw1al13
 */
public class PadelCourt {

    private int number;
    private int type;
    private String[] bookingHours;
    public static final int SINGLE = 1;
    public static final int DOUBLE = 2;

    public PadelCourt(int number, int type, String[] bookingHours) {
        this.number = number;
        this.type = type;
        this.bookingHours = bookingHours;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String[] getBookingHours() {
        return bookingHours;
    }

    public void setBookingHours(String[] bookingHours) {
        this.bookingHours = bookingHours;
    }
}
