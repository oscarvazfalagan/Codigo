/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_1_2;

import java.util.Date;

/**
 *
 * @author daw1al13
 */
public class Substitute extends Teacher {

    private double displacement;
    private java.util.Date intiDate;

    /**
     *
     * @return
     */
    public double getDisplacement() {
        return displacement;
    }

    /**
     *
     * @param displacement
     */
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    /**
     *
     * @return
     */
    public Date getIntiDate() {
        return intiDate;
    }

    /**
     *
     * @param intiDate
     */
    public void setIntiDate(Date intiDate) {
        this.intiDate = intiDate;
    }

    /**
     *
     */
    @Override
    public void generatePayroll() {
        super.salary = this.displacement + super.baseSalary;
    }

    /**
     *
     */
    @Override
    public void teach() {
        System.out.println("Substitúo unha clase de programación en Java");
    }


    

}
