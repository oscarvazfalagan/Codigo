/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicicio_2_4_3;

/**
 *
 * @author daw1al13
 */
public class Ejercicicio_2_4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean carne_universitario = true;
        boolean paro = false;
        boolean xubilado = true;
        boolean carne_familia = true;
        int age = 29;

        if (age < 30) {
            if (carne_universitario == true & paro == true) {
                System.out.println("El precio es de 35 €");
            }else if (carne_universitario == true | paro == true){
                System.out.println("El precio es de 40 €");
            } else {
                System.out.println("El precio es de 50 €");
            }
        } else if (age > 55) {
            if (xubilado == true | paro == true) {
                System.out.println("El precio es de 45 €");
            } else {
                System.out.println("El precio es de 60 €");
            }
        } else {
            if (carne_familia == true){
                System.out.println("El precio es de 75 €");
            }else{
                System.out.println("El precio es de 65 €");
            }
            
        }
    }
    
}
