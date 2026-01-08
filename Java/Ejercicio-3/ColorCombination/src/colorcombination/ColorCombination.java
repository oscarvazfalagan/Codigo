/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colorcombination;

/**
 *
 * @author daw1al13
 */
public class ColorCombination {
    //Array de numeros para establecer combinaciones
    private int combination[];

    public int[] getCombination() {
        return combination;
    }

    public void setCombination(int[] combination) {
        this.combination = combination;
    }

    public final static int NUMBER_OF_COLORS = 4;
    public final static int COMBINATION_SIZE = 3;
    public final static int RED = 0;
    public final static int GREEN = 1;
    public final static int YELLOW = 2;
    public final static int PINK = 3;

    /**
     * Muestra los Valores de los colores como string
     * @return 
     */
    public String getColorsAsString() {
        String colors = "";
        for (int colores : combination) {
            if (colores == 0) {
                System.out.print("rojo ");
            } else if (colores == 1) {
                System.out.print("verde ");
            } else if (colores == 2) {
                System.out.print("amarillo ");
            } else if (colores == 3) {
                System.out.print("rosa ");
            }
        }
        return colors;
    }
    /**
     * Genera una combinacion de numeros ale
     */
    public void genereateCombination() {
        this.combination = new int[COMBINATION_SIZE];
        int value; // Inicializamos la variable value para guardar el numero aleatorio
        //Valor de las combinaciones
        for (int i = 0; i < combination.length; i++) {
            do {
                value = (new java.util.Random().nextInt(COMBINATION_SIZE)) + 1; // Generamos un numero aleatorio entre 1 y MAX_NUMBER
            } while (checker(value) == true); // Comprobamos que el numero no este repetido en la matrizso
            this.combination[i] = value; // Si no esta repetido lo guardamos en la matriz
        }
    }
    /**
     * Constructor que ejecuta el metodo generateCombination()
     */
    public ColorCombination() {
        genereateCombination();
    }
    /**
     * Metodo que checkea si esta en la matriz
     * @param value
     * @return 
     */
    private boolean checker(int value) {
        // Variable confim para confirmar si el numero ya existe en la matriz
        boolean confirm = false;
        // Recorremos la matriz para comprobar si el numero ya existe

        for (int i = 0; i < combination.length && !confirm; i++) {
            if (value == this.combination[i]) {// Comparamos value con todas las posiciones de la matriz
                confirm = true; // si el numero ya existe confirm es true y se vuelve a generar otro numero
                // random
            }
        }
        // Devolvemos el valor confirm que sera false si el numero no existe en la
        // matriz y true si ya existe
        // haciendo que se ejecute otra vez el bucle do while
        return confirm;
    }
    /**
     * Obtiene el numero de hits totales
     * @param anotherConmbination
     * @return 
     */
    public int gethits(ColorCombination anotherConmbination) {
        //Obtienes los numeros de la combinacion
        int[] ColorsHits = anotherConmbination.getCombination();
        //Una variable para saber cuantos numeross son iguales
        int Hits = 0;
        //Recorremos el array
        for (int i = 0; i < combination.length; i++) {
            //Si un valor de color hits es igual que el de la combinacion suma uno a hits
            //ERROR: No se porque simpre devuelve como si los tres numeros fuese  iguales no me doy cuenta del porque
            if (ColorsHits[i] == this.combination[i]) {
                Hits += 1;
            }
        }
        return Hits;
    }
    /**
     * Devuelve el total de colores comunes
     * @param anotherCombination
     * @return 
     */
    public int getCommonColors(ColorCombination anotherCombination) {
        //Obtienes los numeros del ticket
        int[] ColorCombinarion = anotherCombination.getCombination();
        //Una variable para saber cuantos numeros han sido premiados
        int common = 0;
        //Obtenemos el valor del reintegro del ticket

        //Recorremos los numeros del ticket
        for (int i = 0; i < combination.length; i++) {
            //Si ese valor al pasar por el checker existe devuelve true por lo tanto es un premiado
            if (checker(ColorCombinarion[i])) {
                common += 1;
            }//y si uno del ticket cuadra con el complementario lo establezemos como true
        }
        return common;
    }
}
