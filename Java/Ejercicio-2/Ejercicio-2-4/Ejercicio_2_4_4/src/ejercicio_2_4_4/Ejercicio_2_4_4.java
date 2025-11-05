/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_4_4;

/**
 *
 * @author daw1al13
 */
public class Ejercicio_2_4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Wallet cartera1 = new Wallet(250,false);
        Wallet cartera2 = new Wallet(25,true);
        Wallet cartera3 = new Wallet(10,false);
        
        System.out.println(cartera1.available());
        System.out.println(cartera2.available());
        System.out.println(cartera3.available());
    
    }
    
}
