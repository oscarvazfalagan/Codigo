/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicicio_2_7_2;
import java.util.Scanner;
/**
 *Clase Main que sume los multiplos de 5 excepto si 
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
        int auxiliar =0;//Variable auxiliar por si hay que cambiar los numeros
        
        //Substitucion de valores
        if (number2>number1){
            auxiliar = number1;
            number1 = number2;
            number2 = auxiliar;
            
        }
        //Si a o b es negativo imprime que tiene que ser positivo
        if (number1 < 0 || number2 <0){
            System.out.println("Los valores tiene que ser positivos");
        
        }else{
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
}

 