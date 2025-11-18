/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3_2_4;

/**
 * Clase AdventCalendar que representa un calendario de adviento
 * 
 * @author daw1al13
 */
public class AdventCalendar {
    // Variable estatica para definir las filas y columnnas de la matriz
    public static final int ROWS = 6;
    public static final int COLUMS = 4;

    private int matrix[][] = new int[ROWS][COLUMS];// Matriz de 6 filas y 4 columnas para guardar los 24 dias del
                                                   // calendario
    public static final int MAX = 24; // Constante MAX para definir el numero maximo del calendario
    private int min = 0; // Variable min para que busque el numero mas pequeño desde el 0

    /**
     * Metodo para llenar la matriz con numeros aleatorios entre 1 y 24
     */
    public void fill() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int value; // Inicializamos la variable value para guardar el numero aleatorio
                do {
                    value = (new java.util.Random().nextInt(MAX)) + 1; // Generamos un numero aleatorio entre 1 y 24

                } while (checker(value) == true); // Comprobamos que el numero no este repetido en la matriz
                matrix[i][j] = value; // Si no esta repetido lo guardamos en la matriz
            }
        }

    }

    /**
     * Metodo para comprobar si un numero ya existe en la matriz
     */
    private boolean checker(int value) {
        // Variable confim para confirmar si el numero ya existe en la matriz
        boolean confirm = false;
        // Recorremos la matriz para comprobar si el numero ya existe
        for (int i = 0; i < matrix.length && !confirm; i++) {
            for (int j = 0; j < matrix[i].length && !confirm; j++) {
                if (value == matrix[i][j]) {// Comparamos value con todas las posiciones de la matriz
                    confirm = true; // si el numero ya existe confirm es true y se vuelve a generar otro numero
                                    // random
                }
            }
        }
        // Devolvemos el valor confirm que sera false si el numero no existe en la
        // matriz y true si ya existe
        // haciendo que se ejecute otra vez el bucle do while
        return confirm;
    }

    /**
     * Metodo para mostrar la matriz por pantalla
     */
    public void show() {
        System.out.println("Calendario de Navidad");
        System.out.println("------------------");
        // Recorremos la matriz y motramos los valores por pantalla
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println("------------------");
    }

    /**
     * Metodo para comer el dia mas pequeño del calendario
     */
    public void eat() {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == this.min + 1) { // Comparamos el numero de la matrix hasta que sea equivalente al
                                                    // numero mas pequño
                    matrix[i][j] = 0; // Establezemos ese valor de la matrix a 0 pera interpretar que se ha comido
                }
            }
        }
        this.min++; // Como el numero minimo ya se ha comido añadimos un numero mas
    }

    /**
     * Metodo para comprobar si ya se ha llegado a navidad
     * 
     * @return booleano que indica si ya se ha llegado a navidad
     */

    public boolean christmasisHere() {
        // Inicializamos un contador de dias comidos y un booleano para indicar si es
        // navidad
        int dayCounter = 0;
        boolean isChristmas = false;
        // Recorremos la matriz y contamos los dias comidos
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) { // Si el valor de la matriz es 0 el dia contara como comido
                    dayCounter++; // Como el dia esta comido aumentamos en uno el contador
                }
            }
        }
        // Si el contador es igual a 24 dias sabremos que es navidad
        if (dayCounter == 24) {
            // Mensaje de felicidad por la navidad
            System.out.println("Se comieron todos los dias : ");
            System.out.println("Feliz navidad !!!");
            isChristmas = true;// Como es navidad el booleano isChristmas sera true
        }
        return isChristmas;// Devolvemos el valor del booleano
    }

}
