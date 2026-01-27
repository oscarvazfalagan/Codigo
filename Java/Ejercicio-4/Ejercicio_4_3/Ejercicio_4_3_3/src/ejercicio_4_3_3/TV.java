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
    private boolean Teletext;
    private double inchees;

    public TV(boolean Teletext, double inchees, int Consumption, double price) {
        super(Consumption, price);
        this.Teletext = Teletext;
        this.inchees = inchees;
    }

    public boolean isTeletext() {
        return Teletext;
    }

    public void setTeletext(boolean Teletext) {
        this.Teletext = Teletext;
    }

    public double getInchees() {
        return inchees;
    }

    public void setInchees(double inchees) {
        this.inchees = inchees;
    }
    
}
