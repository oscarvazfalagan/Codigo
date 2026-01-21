/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_1;

/**
 * Metodo square subclase de shape que representa un cuadrado
 *
 * @author daw1al13
 */
public class Square extends Shape {

    /**
     * Metodo sobrescrito que muestra pos pantalla dibujar un cuadrado
     */
    @Override
    public void draw() {
        System.out.println("Dibujando un cadrado");
    }

    /**
     * Metodo sobrescrito que muestra pos pantalla borraste un cuadrado
     */
    @Override
    public void erase() {
        System.out.println("Borrando un cuadrado");
    }

}
