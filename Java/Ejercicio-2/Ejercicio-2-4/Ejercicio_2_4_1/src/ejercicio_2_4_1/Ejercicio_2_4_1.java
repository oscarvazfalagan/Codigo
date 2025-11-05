/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_4_1;
import java.util.Scanner;
/**
 *
 * @author daw1al13
 */
public class Ejercicio_2_4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        
        int mesI;
        boolean yearI;
        
        System.out.println("El año que quieres usar es bisiesto  : ");
        System.out.println("true --- si");
        System.out.println("false --- no");
        yearI = scan.nextBoolean();
        System.out.println("Vamos a  los dias de los meses del año");
        System.out.println("Introduce el numero del mes que quieres :");
       
        mesI =scan.nextInt();
        Year año = new Year(yearI);
        
        año.showDaysMethod(mesI,yearI);
    }
    
}
