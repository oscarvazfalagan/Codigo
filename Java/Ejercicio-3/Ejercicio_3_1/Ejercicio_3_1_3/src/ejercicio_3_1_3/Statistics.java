/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3_1_3;
import java.util.Scanner;
/**
 * Class Statistics que almacena un array de numeros enteros y tiene metodos para obtener la mediana
 * @author daw1al13
 */
public class Statistics {
    Scanner scan = new Scanner(System.in);
    private int numbers[]; // Array de enteros para las notas
    
    /**
     * Metodo privado getNumbers que pide al usuario que introduzca 10 numeros enteros
     *  y los almacena en el array numbers
     */
    private void getNumbers() {
        System.out.println("Introduce 10 notas : ");
        System.out.println("---------------------");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce el numero " + (i + 1) + " : ");
            numbers[i] = scan.nextInt();

        }
    }
    /**
     * Constructor de la clase Statistics que inicializa el array numbers
     *  y llama al metodo getNumbers para llenarlo
     * @param n numero de elementos del array numbers
     */

    public Statistics(int n) {
        //Si el numero es impar no deja continuar
        if (n%2 != 0) {
            this.numbers = new int[n];
            getNumbers();
        }
        else {
            System.out.println("No se puede ejecutar");
        }
    }
    /**
     * Metodo publico median que devuelve la mediana de los numeros almacenados en el array numbers
     * @return mediana de los numeros del array numbers
     */
    public int median(){
        int mediana = 0; //Declaro la variable mediana
        boolean exit = false; 
        //Bucle doble para contar cuantos numeros son mayores y menores que el numero actual
        for (int i = 0; i < numbers.length && !exit; i++) {
            int contadorMin = 0; //Contador de numeros menores
            int contadorMax = 0; //Contador de numeros mayores
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i]>numbers[j]){
                    contadorMin = contadorMin + 1; // Incrementa cuando un numero es mayor
                }
                if (numbers[i]<numbers[j]){
                    contadorMax = contadorMax + 1; // Incrementa cuando un numero es menot
                }
                
            }
            //Si los contadores son iguales significa que el numero es la mediana
            if (contadorMax == contadorMin){
                    mediana = numbers[i];
                    exit = true; // Salimos del bucle
                }
        }
        return mediana; 
    }

}
