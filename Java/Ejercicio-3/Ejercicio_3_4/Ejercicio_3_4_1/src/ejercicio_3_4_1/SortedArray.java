/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3_4_1;

import java.util.Scanner;

/**
 * Clase sorted Array que se basa en crear un array y ordenarlo con diferentes
 * metodos
 *
 * @author oscar
 */
public class SortedArray {

    //Atributos 
    private int numbers[] = new int[6];//Array de numeros
    private boolean sorted = false;//Booleano para comprobar si esta sorteado
    
    /**
     * Meto set para establecer valores al atributo sot
     * @param sorted 
     */
    public void setSorted(boolean sorted) {
        this.sorted = sorted;
    }
    
    /**
     * Metodo get para obtener los valores del atributo sorted
     * @return sorted
     */
    public boolean isSorted() {
        return sorted;
    }

    /**
     * Metodo get para obtener los valores del array
     *
     * @return numbers
     */
    public int[] getNumbers() {
        return numbers;
    }

    /**
     * Metodo set para establecer los valores del array
     *
     * @param numbers
     */
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
    
    /**
     * Metodo sort se basa en ordenar el array atraves del algoritmo Bubble sort
     */
    private void sort() {
        boolean swapped = true;//Creamos un booleano en true para que entre al bucle por las condiciones del for
        for (int i = numbers.length - 1; i > 0 && swapped; i--) {//El for recorre todos los numeros para el primer dijito
            swapped = false; //Indica que no estan cambiados
            for (int j = 0; j < i; j++) {//Recorre todos los numeros para el segundo digito
                if (numbers[j] < numbers[j + 1]) {//Si el numero que esta delante es mayor lo intercamcia para que quede en orden descendente
                    //Intercambio del numero
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;//Y lo da como cambiado
                }
            }
        }
        //Una vez termina el proceso se da el array como ordenado
        this.sorted = true;
    }
        
    /**
     * Metodo para obetener los 6 numeros del array se usa dentro del constructor
     */
    private void obtainNumbers() {
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Decoracion
        System.out.println("Introduze los numeros del array de manera desordenada");
        System.out.println("-------------------------");
        for (int i = 0; i < this.numbers.length; i++) {//Pide que le des valor a todos los espacios del array
            System.out.println("Dime el numero " + (i + 1) + " :");
            this.numbers[i] = scan.nextInt();
        }
    }
    /**
     * Constructor de la clase SortedArray que utiliza un metodo para pedir los numeros
     */
    public SortedArray() {
        obtainNumbers();
    }
    /**
     * Un metodo que imprime los numeros que tiene el array
     */
    private void show() {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    /**
     * El metodo comprueba si esta ordenado si no esta ordenado lo ordena una vez hay,
     * usa un algoritmo de busqueda dicotomica para encontrar el numero que le has introducido al metodo
     * @param numeroBuscado
     * @return 
     */
    public boolean coontains(int numeroBuscado) {
        //Comprueba si el array esta ordenado
        if (!isSorted()) {
            sort();//Si no esta ordenado llama al metodo de ordenacion
        }
        //Establecemos dos 
        int limiteInferior = 0;
        int limiteSuperior = numbers.length - 1;
        //Inicializamos un indice
        int indice;
        //Creamos una variable encontrar para saber si encuentra o no el numero
        boolean found = false;
        //El bucle se ejecuta mientras que no encuentre el valor y si se quedan sin
        //numeros el ciclo se terminara
        while (limiteInferior <= limiteSuperior && !found) {
            //El indice es el numero del medio
            indice = limiteInferior + (limiteSuperior-limiteInferior) / 2;
            //Si el numero es el indice numero encontrado
            if (numbers[indice] == numeroBuscado) {
                found = true;//Le da valor a found y sale del bucle
            } else if (numeroBuscado < numbers[indice]) {
                limiteInferior = indice + 1;//
            } else if (numeroBuscado > numbers[indice]) {
                limiteSuperior = indice - 1;
            }
        }

        return found;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SortedArray array = new SortedArray();
        System.out.println("Numeros sin ordenar :");
        array.show();

        System.out.println("Dime un numero a ver si esta en el array :");
        int numberToFound = scan.nextInt();
        System.out.println("El resutado de que tu numero estaba en el array es : " + array.coontains(numberToFound));
        System.out.println("Numeros ordenados :");
        array.show();

    }
}
