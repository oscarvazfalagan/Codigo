/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_3;

/**
 *
 * @author daw1al13
 */
public abstract class Device {
    protected int Consumption;
    protected double price;

    public Device(int Consumption, double price) {
        this.Consumption = Consumption;
        this.price = price;
    }

    public int getConsumption() {
        return Consumption;
    }

    public void setConsumption(int Consumption) {
        this.Consumption = Consumption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
