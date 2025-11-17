/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3_2_3;

/**
 *
 * @author daw1al13
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AdventCalendar calendar = new AdventCalendar();
        calendar.fill();
        while (!calendar.christmasisHere()) {
            System.out.println("Calendario de Navidad");
            System.out.println("------------------");
            calendar.show();
            calendar.eat();
            System.out.println("------------------");
            System.out.println();
        }
    }
}
