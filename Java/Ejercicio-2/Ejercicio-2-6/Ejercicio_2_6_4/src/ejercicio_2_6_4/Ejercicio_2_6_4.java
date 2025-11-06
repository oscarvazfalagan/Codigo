package ejercicio_2_6_4;

import java.util.Scanner;

/**
 * Clase Main para identificar si un número es primo usando un bucle for
 * @author daw1al13
 */
public class Ejepackage ejercicio_2_6_4;

import java.util.Scanner;

/**
 * Clase Main para identificar si un número es primo usando un bucle for sin break
 * @author daw1al13
 */
public class Ejercicio_2_6_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner para introducir datos
        System.out.print("Dime un número: ");
        int numero = scan.nextInt(); // Valor del número introducido
        boolean esPrimo = true;      // Valor para determinar si es primo

        if (numero <= 1) {
            esPrimo = false; // 0 y 1 no son primos
        } else {
            // Bucle for que comprueba si el número es divisible por algún número menor que él
            for (int i = numero - 1; i > 1; i--) {
                if (numero % i == 0) {
                    esPrimo = false; // Si se puede dividir, no es primo
                }
            }
        }

        // Imprimir resultado
        if (esPrimo) {
            System.out.println("Tu número es primo");
        } else {
            System.out.println("Tu número no es primo");
        }
    }
}
