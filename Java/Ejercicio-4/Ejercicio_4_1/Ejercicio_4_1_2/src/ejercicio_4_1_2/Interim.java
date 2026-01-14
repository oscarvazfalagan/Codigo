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

    /**
     * 
     * @return
     */
    public double getInterimComplement() {
        return interimComplement;
    }

    /**
     *
     * @param interimComplement
     */
    public void setInterimComplement(double interimComplement) {
        this.interimComplement = interimComplement;
    }

    /**
     *
     * @return
     */
    public String getDestination() {
        return Destination;
    }

    /**
     *
     * @param Destination
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     *
     */
    @Override
    public void generatePayroll() {
        super.salary = this.interimComplement + super.baseSalary;
    }

    public Interim(double interimComplement, String Destination, String name, String surname, String address, double baseSalary) {
        super(name, surname, address, baseSalary);
        this.interimComplement = interimComplement;
        this.Destination = Destination;
    }
    
    
}
