/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_3;

/**
 *
 * @author daw1al13
 */
public class Vulture extends Bird {
    public double flightSpeed;
    public double weight;

    public double getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(double flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vulture(double flightSpeed, double weight, String sex, int age) {
        super(sex, age);
        this.flightSpeed = flightSpeed;
        this.weight = weight;
    }
    
}
