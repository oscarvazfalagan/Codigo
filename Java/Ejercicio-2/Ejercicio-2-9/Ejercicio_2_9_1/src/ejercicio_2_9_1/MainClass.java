/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_9_1;

/**
 * Clase Main para probar la clase Pen
 * @author daw1al13
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Creando un objeto de la clase Pen
        Pen myPen = new Pen();
        //Probando los metodos con 20, 15 y 6 unidades de tinta
        myPen.write(20);
        myPen.write(15);
        myPen.write(6);
        System.out.println(myPen.getInk());
        
    }
    
}
