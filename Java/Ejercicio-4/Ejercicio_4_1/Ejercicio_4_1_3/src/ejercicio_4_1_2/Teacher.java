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

    /**
     * Metodo main en el que crea tres objetos profesores de distintas clases y los prueba
     * @param args
     */
    public static void main(String[] args) {
        //Crea los objetos
        CareerOfficer oficer = new CareerOfficer(300,14,"Segundo","Laura","Pedregal","Lugo",1800);
        Interim interin = new Interim(200,"Pazo da Merce","Ramon","Perez","Pontevedra",1700);
        Calendar gc = new GregorianCalendar(2025, 12, 06);
        Substitute substitute = new Substitute(100, gc.getTime(),"Fernando","Pedregal","A coruña",1600);

        //Officer establece los valores de salary
        oficer.generatePayroll();
        System.out.println("Chámome " + oficer.getName() + " e o meu salario é de " + oficer.getSalary() + "$");
        oficer.teach();

        //Interim establece los valores de salary 
        interin.generatePayroll();
        System.out.println("Chámome " + interin.getName() + " e o meu salario é de " + interin.getSalary() + "$");
        interin.teach();

        //Substitute establce los valores de salary
        substitute.generatePayroll();
        System.out.println("Chámome " + substitute.getName() + " e o meu salario é de " + substitute.getSalary() + "$");
        substitute.teach();
    }


}
