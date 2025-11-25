/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3_3_1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

   
/**
 *Clase Marks que contiene un array de 10 notas y metodos para obtener las notas y la media
 * @author daw1al13
 */
public class Marks {
    //Añadimos el Scanner para leer por teclado
    Scanner scan = new Scanner(System.in);
    //Array list de 10 notas
    private ArrayList<Integer> marks =new ArrayList<>(10);

    /**
     * Metodo para obtener las notas con un bucle for
     */
    private void getMarks(){
        System.out.println("Introduce 10 notas : ");
        System.out.println("---------------------");
        for (int i=0; i<10 ; i++){
            System.out.println("Introduce la nota " + (i+1) + " : ");
            int nota = scan.nextInt();
            marks.add(i, nota); 
            
        }
    }
    /**
     * Constructor de la clase Marks que llama al metodo getMarks
     * 
     */
    public Marks() {
        getMarks();
    }
    /**
     * Metodo para calcular la media de las notas
     * @return la media de las notas
     */
    public double getAverage(){
        //Creo un objeto iterador del array list de integer marks
        Iterator<Integer> mark = marks.iterator();
        //Defino la variable para que entre al bucle
        Double average = 0.0;
        //El while solo funciona mientras que tenga una nota para usar
        while (mark.hasNext()){
            average += mark.next(); //Calcula la media y pasa a la siguiente
        }
        return average/10;
    }
    /**
     * Setter para modificar los valores de marks
     * @param marks 
     */
    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }
    
}


