/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4_3_1;

import java.awt.Color;

/**
 * Clase abstracta shape que creara los metodos que usaran las subclases
 * @author daw1al13
 */
public abstract class Shape implements Coloreable{
    
    //Atributo color
    protected java.awt.Color color; 
    
    /**
     * Metodo abstracto debuxar da clase Shape
     */
    public abstract void draw();

    /**
     * Metodo abstracto borrar da clase Shape
     */
    public abstract void erase();
    /**
     * Metodo cobrescrito que le da valor a color
     * @param c 
     */
    @Override
    public void setColor(Color c) {
        this.color=c;
    }
    /**
     * Metodo sobrescrito que obtiene el valor del atributo color
     * @return color
     */
    @Override
    public Color getColor() {
        return this.color;
    }

    

}
