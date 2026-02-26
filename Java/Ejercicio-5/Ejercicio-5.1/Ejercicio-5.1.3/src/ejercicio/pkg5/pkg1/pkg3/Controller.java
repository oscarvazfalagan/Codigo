/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg5.pkg1.pkg3;
import java.lang.Math;
/**
 * Clase controller para chamar metodos que se ejecutan en la view
 * @author daw1al13
 */
public class Controller {
    //Atributo Main view 
    private MainView myView;

    /**
     * Constructor del controller que se crea desde una vista
     */
    public Controller() {
        myView = new MainView(this);
    }
    /**
     * Metodo que introduces tres variables
     * y te ejecuta una ecuacion de segundo grado
     * @param a
     * @param b
     * @param c
     * @return Results 
     * Es un array de doubles porque puede dar positivo y negativo
     */
    public double[] calculation(double a,double b, double c){
        double[] results = new double[2];
        double result1 = (-b+(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
        double result2 = (-b-(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
        results[0] = result1;
        results[1]=result2;
        return results;
    }

}
