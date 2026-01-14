/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_1_2;

/**
 * Subclase de Teacher que establece los valores de la propia clase CareerOfficer
 * @author daw1al13
 */
public class CareerOfficer extends Teacher {
    
    private double officerComplement;
    private int oppositionYear;
    private String oppositionPlace;

    /**
     * Metodo sobrescrito en el que obiene el valor de salary
     */
    @Override
    public void generatePayroll() {
      super.salary = this.officerComplement + super.baseSalary; 
    }

    /**
     * Metodo que obtien los valores de getOfficerComplemnt
     * @return
     */
    public double getOfficerComplement() {
        return officerComplement;
    }

    /**
     * Metodo que establece los valores de OfficerComplemnt
     * @param officerComplement
     */
    public void setOfficerComplement(double officerComplement) {
        this.officerComplement = officerComplement;
    }

    /**
     * Metodo que obtiene los valores del oppositionYear
     * @return oppositionYear
     */
    public int getOppositionYear() {
        return oppositionYear;
    }

    /**
     * Establece los valores de oppositionYear
     * @param oppositionYear
     */
    public void setOppositionYear(int oppositionYear) {
        this.oppositionYear = oppositionYear;
    }

    /**
     * Metodo que obtiene los valores de oppositionPlace
     * @return oppositionPlace
     */
    public String getOppositionPlace() {
        return oppositionPlace;
    }

    /**
     * Metodo abstracto que sobrescribe el metodo payroll para obtenet el valor de salary
     * @param oppositionPlace
     */
    public void setOppositionPlace(String oppositionPlace) {
        this.oppositionPlace = oppositionPlace;
    }
    /**
     * Constructor que establece los valores de la superclase ademas de los propios valores de la clase 
     * @param officerComplement
     * @param oppositionYear
     * @param oppositionPlace
     * @param name
     * @param surname
     * @param address
     * @param baseSalary 
     */
    public CareerOfficer(double officerComplement, int oppositionYear, String oppositionPlace, String name, String surname, String address, double baseSalary) {
        super(name, surname, address, baseSalary);
        this.officerComplement = officerComplement;
        this.oppositionYear = oppositionYear;
        this.oppositionPlace = oppositionPlace;
    }
    
    
    
}
