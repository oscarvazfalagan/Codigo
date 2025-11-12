/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3_1_3;
import java.util.Scanner;
/**
 *
 * @author daw1al13
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame la cantidad de numeros que quieres usar : ");
        int n = scan.nextInt();
        Statistics numbers = new Statistics(n);
        System.out.println("La mediana de tus numeros es : "+numbers.median());
         
    }
    
}
