/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3_4_4;

import java.util.Scanner;

/**
 * Class Statistics que almacena un array de numeros enteros y tiene metodos
 * para obtener la mediana
 *
 * @author daw1al13
 */
public class Statistics {

    Scanner scan = new Scanner(System.in);
    private int numbers[]; // Array de enteros para las notas

    /**
     * Metodo privado getNumbers que pide al usuario que introduzca numeros
     * enteros y los almacena en el array numbers
     */
    private void getNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce el numero " + (i + 1) + " : ");
            numbers[i] = scan.nextInt();
        }
    }

    /**
     * Constructor de la clase Statistics que inicializa el array numbers y
     * llama al metodo getNumbers para llenarlo
     *
     * @param n numero de elementos del array numbers
     */
    public Statistics(int n) {
        // Si el numero es impar no deja continuar
        this.numbers = new int[n];
        getNumbers();
    }

    /**
     * Metodo privado para ordenar el array se trata de un algoritmo de
     * ordenamiento por insercion
     */
    private void sort() {
        //El algoritmo de insercion se basa en recorrese el array haciendo comparaciones
        //y introduciendo dicho numero en su lugar correspondiente,deteniendose si encuentra
        //un numero menor que el posicionandose enfrente, si no sigue hasta el final del array
        for (int i = 0; i < numbers.length; i++) {
            int copyNumber = numbers[i];
            int j = i;
            while (j > 0 && copyNumber < numbers[j - 1]) {
                numbers[j] = numbers[j - 1];
                j--;
            }
            numbers[j] = copyNumber;
        }
    }

    /**
     * Metodo publico median que devuelve la mediana de los numeros almacenados
     * en el array numbers
     *
     * @return mediana de los numeros del array numbers
     */
    public int median() {
        int median = 0;//Establezemos la mediana a 0
        sort();//Ordenamos el arrray
        //La mediana es igual al numero del array que este en la mitad ya que esta ordenado
        median = numbers[numbers.length/2];
        return median;//Devuelve la mediana
    }

}
