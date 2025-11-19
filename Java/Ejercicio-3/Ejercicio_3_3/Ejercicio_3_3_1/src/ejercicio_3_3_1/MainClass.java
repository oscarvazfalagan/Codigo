/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3_3_1;


/**
 * Clase MainClass que contiene el metodo main desde donde usamos la clase Marks
 * @author daw1al13
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Marks mark = new Marks(); //Creamos el objeto de la clase Marks
        double average = mark.getAverage();//Llamamos al metodo getAverage para obtener la media de las notas
        System.out.println("La media de tus numeros es : "+average );//Mostramos la media por pantalla
    }
    
}
