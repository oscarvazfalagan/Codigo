/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicicio_2_7_1;
import java.util.Scanner;
/**
 *Metodo Main para sumar los multiplos de 5 entre dos numeros
 * @author daw1al13
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //Damos los valores de dos numeros
        System.out.println("Dime un numero : ");
        int number1 = scan.nextInt();
        System.out.println("Dime otro numero : ");
        int number2 = scan.nextInt();
        int resultado=1;//Resultado para calcular los multiplos
        int memory=0;//memoia para guardar los numeros
        //Bucle con un contador de un numero al otro sumando los multiplos de 5
        for (int contador=number1; contador > number2;contador--){
            resultado=contador%5;
                    if (resultado == 0){
                        memory=memory+contador;
                    }
        }
        System.out.println("La suma de los multiplos de 5 de tus dos numeros = "+memory);
        
    }
}
 