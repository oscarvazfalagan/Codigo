/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_5_5;

/**
 *Clase main para imprimir los 11 primeros numeros primos
 * @author daw1al13
 */
public class MainClass {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos la variable numero en la que se van a realizar 10 ciclos de numeros impares
        int numero = 1;
        //Un bucle que se repite 10 vezes para imprimir los 10 primeros primos
        for(int n=0;n<10;n++){
            System.out.println(numero);
            numero = numero + 2 ;
        }
    }
    
}
