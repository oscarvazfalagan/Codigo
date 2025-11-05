/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_7_5;

/**
 *Clase main para ejecutar el codigo con metodos y atributos del tarot
 * @author Oscar Vaz falagan
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Creacion de varables
    int day = 29;
    int months=2;
    int year=2024;
    //Creacion de objetos
    Tarot number1 = new Tarot();
    //Uso de metodos
    System.out.println(number1.isLeapYear(year));  
    System.out.println(number1.checkDate(day,months,year));  
    System.out.println(number1.calculateTarot(day, months, year));
    }
    
}
