/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_1;

/**
 * Metodo triangle subclase de shape que representa un triangulo
 *
 * @author daw1al13
 */
public class Triangle extends Shape {

    /**
     * Metodo sobrescrito que muestra pos pantalla dibujar un triangulo
     */
    @Override
    public void draw() {
        System.out.println("Dibujando un triangulo");
    }

    /**
     * Metodo sobrescrito que muestra pos pantalla borraste un triangulo
     */
    @Override
    public void erase() {
        System.out.println("Borrando un triangulo");
    }

}
