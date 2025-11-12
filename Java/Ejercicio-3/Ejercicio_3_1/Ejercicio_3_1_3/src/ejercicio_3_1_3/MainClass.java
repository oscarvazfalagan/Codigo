/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3_1_3;
import java.util.Scanner;
/**
 * Class MainClass que crea un objeto de la clase Statistics y muestra la mediana de los numeros introducidos
 * @author daw1al13
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Creamos el objeto scan de la clase Scanner
        //Pedimos al usuario la cantidad de numeros que quiere usar
        System.out.println("Dame la cantidad de numeros que quieres usar : ");
        int n = scan.nextInt();
        Statistics numbers = new Statistics(n);//Creamos el objeto numbers de la clase Statistics con el numero de elementos n
        System.out.println("La mediana de tus numeros es : "+numbers.median()); //Mostramos la mediana de los numeros introducidos
         
    }
    
}
