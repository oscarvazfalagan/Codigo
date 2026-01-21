/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_1;

import java.awt.Color;

/**
 * Clase para poner aprueba el resto de clases mediante un main
 *
 * @author daw1al13
 */
public class PaintingSession {

    public static void main(String[] args) {
        //Creamos una board para usarlos metodos
        Board board = new Board();
        //Creamos los distintos tipos de figuras
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        circle.setColor(Color.red);
        triangle.setColor(Color.BLUE);
        square.setColor(Color.PINK);
        //Y finalmente probamos todos los metodos
        board.addShape(circle);
        board.addShape(square);
        board.addShape(triangle);
        //Recorro el bucle para mostrar todos los colores
        //Prueba de los colores
        for (int i = 0; i < board.getShapes().size();i++) {
            System.out.println(board.getShapes().get(i).getColor());
        }
        board.clean();
    }
}
