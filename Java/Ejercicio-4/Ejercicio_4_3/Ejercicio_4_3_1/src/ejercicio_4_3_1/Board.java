/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_1;

import java.util.ArrayList;

/**
 *
 * @author daw1al13
 */
public class Board {
    //Atributo Arraylists de shapes
    private ArrayList<Shape> shapes = new ArrayList<>();
    /**
     * Obtiene un shape de dentro de shapes
     * @return shape
     */
    public ArrayList<Shape> getShapes() {
        return shapes;
    }
    /**
     * Establece el valor del array de shapes
     * @param shapes 
     */
    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }
    /**
     * Metodo que añade un shape al array y a su vez lo dibuja
     * @param shape1 
     */
    public void addShape(Shape shape1) {
        shape1.draw();
        this.shapes.add(shape1);
    }
    /**
     * Metodo que muestra como borra todos los shapes y luego los elimina del array
     */
    public void clean() {

        for (int i = 0; i < this.shapes.size() ; i++) {
            this.shapes.get(i).erase();
        }
        this.shapes.clear();
    }
}
