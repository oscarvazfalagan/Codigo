/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_1_2;

/**
 *
 * @author daw1al13
 */
public class Interim extends Teacher {
    
    private double interimComplement;
    private String Destination;

    public double getInterimComplement() {
        return interimComplement;
    }

    public void setInterimComplement(double interimComplement) {
        this.interimComplement = interimComplement;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    @Override
    public void generatePayroll() {
        super.salary = this.interimComplement + super.baseSalary;
    }
    
    
}
