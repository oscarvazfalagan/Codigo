/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_3;

/**
 *
 * @author daw1al13
 */
public class Radio extends Device {
    private boolean Casette;
    private int power;

    public boolean isCasette() {
        return Casette;
    }

    public void setCasette(boolean Casette) {
        this.Casette = Casette;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Radio(boolean Casette, int power, int Consumption, double price) {
        super(Consumption, price);
        this.Casette = Casette;
        this.power = power;
    }
    
}
