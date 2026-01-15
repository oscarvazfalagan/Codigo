/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_1_2;

import java.util.Date;

/**
 * Subclase de Teacher que establece los valores de la propia clase Substitute
 * @author daw1al13
 */
public class Substitute extends Teacher {

    private double displacement;
    private java.util.Date intiDate;

    /**
     * Metodo que obtiene los valores de displacement
     * @return displacement
     */
    public double getDisplacement() {
        return displacement;
    }

    /**
     * Metodo que establece los valores de displacement
     * @param displacement
     */
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    /**
     * Metodo que obtiene los valores de intiDate
     * @return initDate
     */
    public Date getIntiDate() {
        return intiDate;
    }

    /**
     * Metodo que establece los valores de displacement
     * @param intiDate
     */
    public void setIntiDate(Date intiDate) {
        this.intiDate = intiDate;
    }

    /**
     * s
     */
    @Override
    public void generatePayroll() {
        super.salary = this.displacement + super.baseSalary;
    }

    /**
     * Metodo abstracto que sobrescribe el metodo teach para mostrar por pantalla un mensaje
     */
    @Override
    public void teach() {
        System.out.println("Substitúo unha clase de programación en Java");
    }
    
    /**
     * Constructor que establece los valores de la superclase ademas de los propios valores de la clase 
     * @param displacement
     * @param intiDate
     * @param name
     * @param surname
     * @param address
     * @param baseSalary 
     */
    public Substitute(double displacement, Date intiDate, String name, String surname, String address, double baseSalary) {
        super(name, surname, address, baseSalary);
        this.displacement = displacement;
        this.intiDate = intiDate;
    }


    

}
