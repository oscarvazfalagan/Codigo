/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_3;

/**
 * Clase Abstracta que genera los metodos y atributos de un dispositivo
 * @author daw1al13
 */
public abstract class Device {
    //Atributos que heredan todos los dispositivos
    protected int consumption;
    protected double price;

    /**
     * Constructor de la clase Device que usa sus atributos para construir un objeo dispositivos
     * @param consumption
     * @param price 
     */
    public Device(int consumption, double price) {
        this.consumption = consumption;
        this.price = price;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    

    
}
