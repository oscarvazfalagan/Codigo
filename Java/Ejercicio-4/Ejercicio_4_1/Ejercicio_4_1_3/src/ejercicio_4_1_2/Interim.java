/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_1_2;

/**
 * Subclase de Teacher que establece los valores de la propia clase Interim
 * @author daw1al13
 */
public class Interim extends Teacher {
    
    private double interimComplement;
    private String Destination;

    /**
     * Metodo que obtiene los valores de iterimComplement
     * @return
     */
    public double getInterimComplement() {
        return interimComplement;
    }

    /**
     * Metodo que establece los valores de IterimComplement
     * @param interimComplement
     */
    public void setInterimComplement(double interimComplement) {
        this.interimComplement = interimComplement;
    }

    /**
     * Metodo que obtiene los valores de destination
     * @return Destination
     */
    public String getDestination() {
        return Destination;
    }

    /**
     * Metodo que establece el valor de destination
     * @param Destination
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     * Metodo abstracto que sobrescribe el metodo payroll para obtenet el valor de salary
     */
    @Override
    public void generatePayroll() {
        super.salary = this.interimComplement + super.baseSalary;
    }
    /**
     * Constructor que establece los valores de la superclase ademas de los propios valores de la clase 
     * @param interimComplement
     * @param Destination
     * @param name
     * @param surname
     * @param address
     * @param baseSalary 
     */
    public Interim(double interimComplement, String Destination, String name, String surname, String address, double baseSalary) {
        super(name, surname, address, baseSalary);
        this.interimComplement = interimComplement;
        this.Destination = Destination;
    }

    
}
