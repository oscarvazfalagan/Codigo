/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3_2_4;

/**
 *Clase principal para ejecutar el calendario de adviento
 * @author daw1al13
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos un objeto de la clase Advent Calendar
        AdventCalendar calendar = new AdventCalendar();
        calendar.fill();//Lo rellenamos con numeros aleatorios
        // Lo mostramos por pantalla una vez relleno
        calendar.show();
        //Mientras no sea navidad se comera un dia del calendario y se volvera a mostrar por pantalla el calendario
        while (!calendar.christmasisHere()) {
            calendar.eat();
            calendar.show();
            
        }
    }
}
