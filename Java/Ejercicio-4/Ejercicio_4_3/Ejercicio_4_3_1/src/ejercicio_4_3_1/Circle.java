/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_1;

/**
 * Metodo circle subclase de shape que representa un circulo
 *
 * @author daw1al13
 */
public class Circle extends Shape {

    /**
     * Metodo sobrescrito que muestra pos pantalla dibujar un circulo
     */
    @Override
    public void draw() {
        System.out.println("Dibujando un circulo");
    }

    /**
     * Metodo sobrescrito que muestra pos pantalla borraste un circulo
     */
    @Override
    public void erase() {
        System.out.println("Borrando un circulo");
    }

}
