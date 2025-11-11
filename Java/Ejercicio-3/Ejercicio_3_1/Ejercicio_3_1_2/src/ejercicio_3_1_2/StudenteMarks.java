/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3_1_2;

import java.util.Scanner;

/**
 * Clase StudenteMarks que almacena las notas y los nombres de 10 estudiantes y
 * tiene metodos para obtener la nota minima y maxima
 * 
 * @author daw1al13
 */
public class StudenteMarks {
    // Atributos y Scanner
    Scanner scan = new Scanner(System.in);
    private int marks[] = new int[10];// Array de enteros para las notas
    private String student[] = new String[10];// Array de String para los nombres de los estudiantes

    /**
     * Metodo privado getMarks que pide al usuario que introduzca los nombres y las
     * notas de 10 estudiantes
     */
    private void getMarks() {
        System.out.println("Vas a introduzir 10 alumnos con sus respectivas notas : ");
        System.out.println("--------------------------------------------------------");
        //El bucle for toma los valores de marks porque loa arrays tienen la misma longitud
        for (int i = 0; i < marks.length ; i++) { 
            System.out.println("Introduce el estudiante " + (i + 1) + " : ");
            student[i] = scan.nextLine();
            System.out.println("Introduce la nota " + (i + 1) + " : ");
            marks[i] = scan.nextInt();
            scan.nextLine();
        }
    }

    /**
     * Constructor de la clase StudenteMarks que llama al metodo getMarks para
     * inicializar los arrays
     * 
     * @return getMarks
     */
    public StudenteMarks() {
        getMarks();
    }

    /**
     * Metodo publico min que devuelve el nombre y la nota del estudiante con la
     * nota minima
     * 
     * @return String con el nombre y la nota del estudiante con la nota minima
     */
    public String min() {
        int mark = Integer.MAX_VALUE;      //Cojo el valor maximo para que cualquier numero sea menor que el para comenzar
        String person = "";     //Declaro el string a fuera para introducirlo en el bucle
        //El bucle for toma los valores de marks porque loa arrays tienen la misma longitud
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < mark) {
                mark = marks[i];
                person = student[i];
            }
        }
        return "La persona con la nota mas baja es " + person + " con una nota de un : " + mark;
    }
    /**
     * Metodo publico max que devuelve el nombre y la nota del estudiante con la
     * nota maxima
     * 
     * @return String con el nombre y la nota del estudiante con la nota maxima
     */
    public String max() {
        int mark = Integer.MIN_VALUE;   //Cojo el valor minimo para que cualquier numero sea mayor que el para comenzar
        String person = "";     //Declaro el string a fuera para introducirlo en el bucle
        //El bucle for toma los valores de marks porque loa arrays tienen la misma longitud
        for (int i = 0; i < marks.length ; i++) {
            if (marks[i] > mark) {
                mark = marks[i];
                person = student[i];
            }
        }
        return "La persona con la nota mas alta es " + person + " con una nota de un : " + mark;
    }

}
