/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_5_1;
import java.util.Scanner;
/**
 *Clase Main para ejecutar un factorial
 * @author Oscar Vaz Falagan
 */
public class MainClass{
    
    public static void main(String[] args) {
    //Creamos un objeto escaner para darle valor a numero
    Scanner scan = new Scanner(System.in);
    long numero;
    long factorial = 1; // Empieza en 1, no en 0 para que al multiplicar por numero no quede en 0
    long guardado=0;//variable àra guardar resultados

    System.out.println("Introduce un número para hacer su factorial: ");
        numero = scan.nextInt();
        //bucle while para realizar la operacion del factorial
        while (numero > 1) {
            factorial = factorial * numero;
            guardado=guardado+factorial;
            numero = numero - 1;
        }
        //Imprimimos resultados
        System.out.println("El factorial es: " + factorial);
    }
}

