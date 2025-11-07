/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_6_2;
import java.util.Scanner;
/**
 *Clase Main para hacer multiplicaciones mediante bucle for
 * @author daw1al13
 */
public class MainClass {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Creamos un objeto escaner para poder recibir informacion
        Scanner scan = new Scanner(System.in);
       //Le damos valor a la variable
      System.out.println("Dime un numero : ");
      int number1 = scan.nextInt();
      System.out.println("Dime otro numero : ");
      int number2 = scan.nextInt();
      int result = 0 ;
       //Ejecutamos un bucle el numero de vezes que haga falta como el segundo factor
      for (int n=0 ;n<number2;n++){
          result += number1;
      }
       //Imprimimos el resultado
      System.out.println("La multiplicacion de tus numeros es : "+result);
    }
    
}
