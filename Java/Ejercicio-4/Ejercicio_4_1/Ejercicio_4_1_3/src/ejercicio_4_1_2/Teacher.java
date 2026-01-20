/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4_1_2;

import java.util.Calendar;

import java.util.GregorianCalendar;

/**
 * Implementa la clase abstracta teacher que le da valores al resto de clases
 * @author daw1al13
 */
public abstract class Teacher {

    private String name;
    private String surname;
    private String address;

    /**
     *Salario base de un profesor
     */
    protected double baseSalary;

    /**
     *Salario de un profesor
     */
    protected double salary;

    /**
     *Metodo enseñar que muestra por pantalla que da una clase
     */
    public void teach() {
        System.out.println("Dou unha clase de programacion en Java");
    }

    /**
     *Metodo abstracto para generar el resultado de salary
     */
    public abstract void generatePayroll();

    /**
     *Metodo get que obtiene el valor de name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Metodo set que establece el valor de main
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo get que obtiene el valor de surname
     * @return surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Metodo set que establece el valor de surname
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Metodo get que obtiene el valor de Adrees
     * @return Adress
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Metodo get que obtiene el salario base
     * @return baseSalary
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * Metodo set que establece el valor del salario base
     * @param baseSalary
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * Metodo get que obtiene el salario
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Metodo set que estableze el valor del salario
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Constructor teacher que establece los valores del nombre,apellidos,direccion y salario base
     * @param name
     * @param surname
     * @param address
     * @param baseSalary 
     */
    public Teacher(String name, String surname, String address, double baseSalary) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.baseSalary = baseSalary;
    }

}
