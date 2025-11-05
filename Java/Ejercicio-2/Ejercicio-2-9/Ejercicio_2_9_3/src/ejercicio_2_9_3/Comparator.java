/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2_9_3;

import java.util.Scanner;

/**
 *Clase Comparator que permite comparar 10 números e identificar el mayor
 * @author daw1al13
 */
public class Comparator {
    /**
     * Método para obtener el número más grande entre 10 números introducidos por el usuario
     */
    public void getBigger(){
       //Creando un objeto Scanner para obtener los numeros
        Scanner scan = new Scanner(System.in);
        //Mensaje inicial
        System.out.println("Vas a introducir 10 numeros ");
        System.out.println("------------------------------");
        int Maxnumber = Integer.MIN_VALUE; //Inicializando Maxnumber con el valor mínimo posible para compararlo
        //Bucle para solicitar 10 números al usuario
        for (int i = 10 ; i >=0 ; i--){
            System.out.println("Introduce un numero : ");
            int number = scan.nextInt();
            //Comparando el número introducido con el número máximo actual
            if (number > Maxnumber){
                Maxnumber = number ;
            }
        }
        System.out.println("El numero mas grande que has introducido es : "+ Maxnumber);//Mostramos el número más grande
    }
}
