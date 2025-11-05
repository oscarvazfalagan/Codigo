package ejercicio_2_6_4;

import java.util.Scanner;

/**
 * Clase Main para crear un identificador de numero primos atraves de bucles
 * @author daw1al13
 */
public class Ejercicio_2_6_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner para introducir datos
        System.out.print("Dime un número: ");
        int numero = scan.nextInt(); // Valor del número introducido
        int resultado;               // Variable para el bucle
        int contador = numero - 1;   // Comenzamos comprobando desde numero - 1
        boolean esPrimo = true;      // Suponemos que es primo hasta demostrar lo contrario

        if (numero <= 1) {
            esPrimo = false; // 0 y 1 no son primos y al dividir darian 0 por lo tanto van fuera
        }

        // Bucle que busca si un número es primo o no
        while (contador > 1 && esPrimo) {
            resultado = numero % contador;
            if (resultado == 0) {
                esPrimo = false; // Encontramos si encontramos un divisor no es primo
            }
            contador--; // Pasamos al siguiente numero
        }

        // Imprimir resultado
        if (esPrimo) {
            System.out.println("Tu número es primo");
        } else {
            System.out.println("Tu número no es primo");
        }
    }
}
