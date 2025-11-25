/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_9_4;

import java.util.Scanner;

/**
 * Clase Main para un juego en el que tienes que adivinar un numero
 * @author daw1al13
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos un scanner para poder recibir los parametros que nos indica
        Scanner scan = new Scanner(System.in);
        //Configuracion del juego establezemos un valor para el estatico MAX y 
        //el numero de intentos que se quiere usar
        System.out.println("Vamos a jugar un juego de adivinar un numero aleatorio ");
        System.out.println("------------------------");
        System.out.println("Primero vamos a configurarlo ");
        System.out.println("------------------------");
        System.out.println("Dime el valor maximo de los numeros que quieres jugar ---- > ");
        final int MAX = scan.nextInt();
        System.out.println("Dime cuantos intentos quieres usar para adivinar el numero ---- > ");
        int trys = scan.nextInt();
        
        //Decoracion
        System.out.println("------------------------");
        System.out.println("        COMENZAMOS      ");
        System.out.println("------------------------");
        int number = 0;//Inicalizamos el numero que vamos a pedir a cero para que entre al bucle
        boolean exit = false;//Creamos una variable para forzar la salida en caso de victoria o derrota
        int value = new java.util.Random().nextInt(MAX);//Se genera un numero random con el valor MAX establecido
        //El bucle se ejecutara el numero de intentos selecionado o en su defecto hasta que ganes
        for (int i = trys; i > 0 && !exit; i--) {
            System.out.println("Dime un numero : ");
            number = scan.nextInt(); 
            int remainTrys = i - 1; //Despues de recibir el numero pierdes un intento
            
            //En caso de que no te queden intentos pueden pasar dos cosas            
            if (remainTrys == 0) {
                //1.Si te ha cuadrado en el ultimo intento adivinar el valor saldra la victoria y forzara la salida
                if (number == value) {
                    System.out.println("Has ganado - El numero era | " + value + " | lo has conseguido ");
                    System.out.println("ENHORABUENA !!!!!!!!!!");
                    exit = true;
                //2.Si en el ultimo try no adivinaste el valor te quedaste sin intentos por lo tanto perdiste
                } else {
                    System.out.println("No te quedan intentos perdiste");
                    exit = true;
                }
            }
            //Si te quedan intentos pueden pasar tres cosas
            else{
                //1.Si tu numero es mayor devolvera una mensaje indicando que el aleatorio es menor y tu numero de intentos
                if (number > value) {
                System.out.println("Incorrecto - El numero es menor que " + number + " te quedan " + remainTrys + " intentos");
                
                //2.Si tu numero es menor devolvera una mensaje indicando que el aleatorio es mayor y tu numero de intentos
                } else if (number < value) {
                System.out.println("Incorrecto - El numero es mayor que " + number + " te quedan " + remainTrys + " intentos");
                
                //3.Si no es ninguna de las dos significa que es igual por lo tanto has ganado y fueza la salida del bucle
                } else {
                System.out.println("Has ganado - El numero era | " + value + " | lo has conseguido ");
                System.out.println("ENHORABUENA !!!!!!!!!!");
                exit = true;
                }
            }
        }

    }

}
