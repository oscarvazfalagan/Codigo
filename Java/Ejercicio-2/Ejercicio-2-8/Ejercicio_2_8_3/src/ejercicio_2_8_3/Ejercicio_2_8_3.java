/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_8_3;
import java.util.Scanner;
/**
 * Clase principal para saber los numeros primos desde un numero dado hasta el 0
 * @author oscar
 */
public class Ejercicio_2_8_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Pedimos un numero por teclado
        System.out.println("Dime un numero : ");
        int number = scan.nextInt();
        Prime primo = new Prime();//Creamos un objeto de la clase Prime
        //Analizamos desde el numero dado hasta el 1 si el numero es primo    
        for(int i = number;i > 1 ;i--){
            if (primo.isPrime(i)){
                System.out.println("El numero "+i+" es primo");
            }
            
        }
        
    }
    
}
