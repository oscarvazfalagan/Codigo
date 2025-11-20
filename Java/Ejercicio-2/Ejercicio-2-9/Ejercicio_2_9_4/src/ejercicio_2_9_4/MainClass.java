/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_9_4;

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
        System.out.println("Vamos a jugar un juego ");
        System.out.println("------------------------");
        System.out.println("Primero vamos a configurarlo ");
        System.out.println("------------------------");
        System.out.println("Dime el valor limite en el que quieres jugar ---- > ");
        final int MAX = scan.nextInt();
        System.out.println("Dime cuantos intentos quieres usar para adivinar el numero ---- > ");
        int trys = scan.nextInt();
        System.out.println("------------------------");
        System.out.println("        COMENZAMOS      ");
        System.out.println("------------------------");
        int number = 0;
        boolean exit = false;
        int value = new java.util.Random().nextInt(MAX);
        for (int i = trys; i > 0 && !exit; i--) {
            System.out.println("Dime un numero : ");
            number = scan.nextInt();
            int remainTrys = i - 1;
            if (remainTrys == 0) {
                if (number == value) {
                    System.out.println("Has ganado - El numero era | " + value + " | lo has conseguido ");
                    System.out.println("ENHORABUENA !!!!!!!!!!");
                    exit = true;
                } else {
                    System.out.println("No te quedan intentos perdiste");
                    exit = true;
                }
                    
            }
            else{
                if (number > value) {
                System.out.println("Incorrecto - El numero es menor que " + number + " te quedan " + remainTrys + " intentos");
                } else if (number < value) {
                System.out.println("Incorrecto - El numero es mayor que " + number + " te quedan " + remainTrys + " intentos");

                } else if (number == value) {
                System.out.println("Has ganado - El numero era | " + value + " | lo has conseguido ");
                System.out.println("ENHORABUENA !!!!!!!!!!");
                exit = true;
                }
            }
        }

    }

}
