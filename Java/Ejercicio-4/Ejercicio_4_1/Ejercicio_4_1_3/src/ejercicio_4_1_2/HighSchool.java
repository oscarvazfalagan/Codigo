/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_1_2;

import java.util.ArrayList;

/**
 * Clase HighSchool que tiene profesores usa objetos profesores
 * @author daw1al13
 */
public class HighSchool {

    private String name;
    private ArrayList<Teacher> profesores;

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public ArrayList<Teacher> getProfesores() {
        return profesores;
    }

    /**
     *
     * @param profesores
     */
    public void setProfesores(ArrayList<Teacher> profesores) {
        this.profesores = profesores;
    }

    /**
     *
     * @param name
     */
    public HighSchool(String name) {
        this.name = name;
        this.profesores = new ArrayList<Teacher>();
    }

    /**
     * Metodo most paid que devuelve el profesor mejor pagado de la escuela
     *
     * @return Obxecto co profesor mellor pagado, ou null se non hai profesores
     * na lista
     */
    public Teacher mostPaid() {
        Teacher ProfeMostPaid = null;
        for (int i = 0; i < profesores.size(); i++) {

            double mostPaid = 0;
            if (profesores.get(i).getSalary() > mostPaid) {
                mostPaid = profesores.get(i).getSalary();
                ProfeMostPaid = profesores.get(i);
            }
        }
        return ProfeMostPaid;
    }

    /**
     * Metodo lestPaid que devuelve el profesor peor pagado de la escuela
     *
     * @return Obxecto co profesor peor pagado, ou null se non hai profesores na
     * lista
     */
    public Teacher lestPaid() {
        Teacher ProfeLestPaid = null;
        for (int i = 0; i < profesores.size(); i++) {

            double lestPaid = Double.MAX_VALUE;
            if (profesores.get(i).getSalary() < lestPaid) {
                lestPaid = profesores.get(i).getSalary();
                ProfeLestPaid = profesores.get(i);
            }
        }
        return ProfeLestPaid;
    }

    /**
     * Metodo salaryCosts que devuelve el total de lo que valen los salarios de
     * todos los profesores
     *
     * @return totalSalary
     */
    public double salaryCosts() {
        double totalSalary = 0;
        for (int i = 0; i < profesores.size(); i++) {
            totalSalary += profesores.get(i).getSalary();
        }
        return totalSalary;
    }

    /**
     * Metodo que usa salary costs para calcular el average salary
     *
     * @return AverageSalary
     */
    public double salaryAverage() {
        double AverageSalary = salaryCosts() / profesores.size();
        return AverageSalary;
    }

}
