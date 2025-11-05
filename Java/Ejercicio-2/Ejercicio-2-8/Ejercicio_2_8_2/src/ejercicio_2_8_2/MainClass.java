/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_8_2;

/**
 *Clase main para matiz 5x5
 * @author daw1al13
 */
public class MainClass {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dimension = 6;//Numero de dimensiones
        int numero_initial = 10;//Numero Inicial
        boolean exitFor = false;//Exit bucle for
        
        
        //Especificaciones
        System.out.println("Programa con un solo bucle :");
        
        System.out.println();
        //Bucle for para que ejecute la matriz
        for (int numero = numero_initial; numero >= dimension && !exitFor; numero--) {

            System.out.print(numero + "   ");//Ejecuta la linea de codigo
            
            //Cuando completa la linea salta y le resta uno a los valores
            if (numero == dimension) {
                System.out.println(" ");
                numero = numero_initial;
                numero_initial = numero_initial - 1;
                dimension = dimension - 1;
                if (dimension == 1) {//Cuando la dimension es igual a uno fuerza la salida
                    exitFor = true;
                }
            }

        }
        
        
        System.out.println();
        
        System.out.println("Programa con dos bucle :");
        
        System.out.println();
        
        
        //Mas sencillo y versatil para tablas se basa en la creacion de dos bucles
        //que estableceran el numero de filas y columnas cuando se complete una fila hara un salto de linea
        for (int columna=0; columna<5; columna++) {
            for (int fila=0; fila<5; fila++) {
                System.out.print(10-fila-columna + "  ");
            }
            System.out.println();
        }

    }
}
