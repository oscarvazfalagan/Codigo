/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *  implementa un elemento da carta do restaurante 
 * @author daw1al13
 */
public class MenuItem {
    private int id;
    private String descripcion;
    private double prezo;

    public MenuItem(int id, String descripcion, double prezo) {
        this.id = id;
        this.descripcion = descripcion;
        this.prezo = prezo;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrezo() {
        return prezo;
    }
}
