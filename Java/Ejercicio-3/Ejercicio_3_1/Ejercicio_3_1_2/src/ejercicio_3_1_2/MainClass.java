/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3_1_2;

/**
 * MainClass que crea un objeto de la clase StudenteMarks y muestra la nota minima y maxima
 * @author daw1al13
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudenteMarks students = new StudenteMarks();//Creamos el objeto students de la clase StudenteMarks
        System.out.println(students.min());//Mostramos la nota minima
        System.out.println(students.max());//Mostramos la nota maxima
        
    }
    
}
