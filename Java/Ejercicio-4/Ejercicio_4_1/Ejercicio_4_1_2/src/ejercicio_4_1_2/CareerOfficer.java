/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_1_2;

/**
 *
 * @author daw1al13
 */
public class CareerOfficer extends Teacher {
    
    private double officerComplement;
    private int oppositionYear;
    private String oppositionPlace;

    @Override
    public void generatePayroll() {
      super.salary = this.officerComplement + super.baseSalary; 
    }

    public double getOfficerComplement() {
        return officerComplement;
    }

    public void setOfficerComplement(double officerComplement) {
        this.officerComplement = officerComplement;
    }

    public int getOppositionYear() {
        return oppositionYear;
    }

    public void setOppositionYear(int oppositionYear) {
        this.oppositionYear = oppositionYear;
    }

    public String getOppositionPlace() {
        return oppositionPlace;
    }

    public void setOppositionPlace(String oppositionPlace) {
        this.oppositionPlace = oppositionPlace;
    }
    
    
    
}
