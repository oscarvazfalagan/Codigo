/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2_8_3;

/**
 *  Clase Prime que contiene el metodo isPrime
 * @author oscar
 */
public class Prime {
    /***
    * Metodo que comprueba si un numero es primo o no
    * @param number Numero a comprobar
    * @return Devuelve true si es primo y false si no lo es
    */
    public boolean isPrime(int number) {
        boolean aux = true; //Establecemos que es primo
        int resultado = 1;  //Variable para almacenar el resultado de la division
        int contador = number-1;//Contador para ir dividiendo desde el numero-1 hasta 2
        boolean exit = false; //Variable para salir del bucle cuando encontremos un divisor
        //Mientras no encontremos un divisor y el contador sea mayor que 1 se ejecutara el bucle
        while (!exit && contador > 1) {
            resultado = number % contador;//Realizamos la division
            if (resultado == 0) {      //Si el resultado es 0, tiene divisor por lo tanto no es primo
                aux=false;  //no es primo
                exit = true;//Salimos del bucle
            }else{
                contador --;    
            }
            
        }
        return aux;//Devolvemos el resultado
    }
}
