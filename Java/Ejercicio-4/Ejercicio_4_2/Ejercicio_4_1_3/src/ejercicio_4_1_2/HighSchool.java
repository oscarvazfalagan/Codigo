/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_1_2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase HighSchool que tiene profesores usa objetos profesores
 *
 * @author daw1al13
 */
public class HighSchool {

    private String name;
    private ArrayList<Teacher> profesores;

    /**
     *Obtiene el nombre del instituto
     * @return string con el nobre del instituto
     */
    public String getName() {
        return name;
    }

    /**
     *Establece el nombre del instituto
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *Devuelve los profesores
     * @return profesores
     */
    public ArrayList<Teacher> getProfesores() {
        return profesores;
    }

    /**
     *Establece un array list con los profesores que hay en el colegio
     * @param profesores
     */
    public void setProfesores(ArrayList<Teacher> profesores) {
        this.profesores = profesores;
    }

    /**
     * Constructor de la clase high school que recibe el nombre de la escuela
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
        double mostPaid = 0;
        for (int i = 0; i < profesores.size(); i++) {
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
     * Metodo que usa salary costs para calcular el average salary de los sueldos
     *
     * @return AverageSalary
     */
    public double salaryAverage() {
        double AverageSalary = salaryCosts() / profesores.size();
        return AverageSalary;
    }

    public static void main(String[] args) {
        HighSchool instituto = new HighSchool("Pazo da merced");
        
        //Crea los objetos
        CareerOfficer oficer = new CareerOfficer(300, 14, "Segundo", "Laura", "Pedregal", "Lugo", 1800);
        Interim interin = new Interim(200, "Pazo da Merce", "Ramon", "Perez", "Pontevedra", 1700);
        Calendar gc = new GregorianCalendar(2025, 12, 06);
        Substitute substitute = new Substitute(100, gc.getTime(), "Fernando", "Pedregal", "A coruña", 1600);

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
        
        //Creamos otro array list para incializar los profesores que hay en el instituto le pasamos los profesores creados anteriormente
        ArrayList<Teacher> profesores = new ArrayList<>();
        profesores.add(oficer);
        profesores.add(interin);
        profesores.add(substitute);
        //Establecemos los profesores del instituto
        instituto.setProfesores(profesores);
        
        //Para probar los metodos imprimimos por pantalla distintas cosas
        
        System.out.println("El profesor mas pagado es : "+instituto.mostPaid().getName());
        
        System.out.println("El profesor menos pagado es : "+instituto.lestPaid().getName());
        
        System.out.println("Los profesores del instituto cobran un total de : "+instituto.salaryCosts()+ " euros");
        
        System.out.println("La media de la paga de los profesores es : "+instituto.salaryAverage()+ " euros");
    }

}
