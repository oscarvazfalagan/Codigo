/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3_3_1;

import java.util.Scanner;


   
/**
 *Clase Marks que contiene un array de 10 notas y metodos para obtener las notas y la media
 * @author daw1al13
 */
public class Marks {
    //Añadimos el Scanner para leer por teclado
    Scanner scan = new Scanner(System.in);
    //Array de 10 notas
    private int marks[] = new int[10];

    /**
     * Metodo para obtener las notas con un bucle for
     */
    private void getMarks(){
        System.out.println("Introduce 10 notas : ");
        System.out.println("---------------------");
        for (int i=0; i<marks.length ; i++){
            System.out.println("Introduce la nota " + (i+1) + " : ");
            marks[i] = scan.nextInt();
            
        }
    }
    /**
     * Constructor de la clase Marks que llama al metodo getMarks
     * @return
     */
    public Marks() {
        getMarks();
    }
    /**
     * Metodo para calcular la media de las notas
     * @return la media de las notas
     */
    public double getAverage(){
        Double average = 0.0;
        for (int i=0; i<marks.length ; i++){
            average += marks[i];
        }
        return average/10;
    }
    
}


