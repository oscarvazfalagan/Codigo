/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_3;

/**
 *
 * @author daw1al13
 */
public class TV extends Device {
    private boolean teletext;
    private double inchees;

    public TV(boolean teletext, double inchees, int consumption, double price) {
        super(consumption, price);
        this.teletext = teletext;
        this.inchees = inchees;
    }

    public boolean isTeletext() {
        return teletext;
    }

    public void setTeletext(boolean teletext) {
        this.teletext = teletext;
    }

    public double getInchees() {
        return inchees;
    }

    public void setInchees(double inchees) {
        this.inchees = inchees;
    }

    
}
