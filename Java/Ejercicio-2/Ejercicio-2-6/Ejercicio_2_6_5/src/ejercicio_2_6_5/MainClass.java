/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_6_5;
import java.util.Scanner;
/**
 *Clase Main para haceer potencias mediante bucles
 * @author daw1al13
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Creamos dos variables para que introduzcan los datos
        System.out.println("Dime un numero : ");
        int number1=scan.nextInt();
        int resultado=number1;//Variable acumulativa de los resultados
        System.out.println("Dime a cuanto lo quieres elevar : ");
        int number2=scan.nextInt();
        //Bucle con un contador hata llegar a 1 
        for (int contador = number2;contador >1;contador--){
            
            resultado=resultado*number1;

        }
        System.out.println("El resultado es = "+resultado);
    }
    
}
