/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_8_1;
import java.util.Scanner;
/**
 *Clase main para ejecutar las clases y metodos
 * @author daw1al13
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Scaner para obtener el valor del numero de las tamblas
        
        //Obtenemos el valor pidiendoselo
        System.out.println("Dime la tabla que quieras : ");
        int number = scan.nextInt();
        //Creamos el objeto y le pedimos que ejecute su metodo¡
        Table table = new Table(number);
        table.show();
        
    }
    
}
