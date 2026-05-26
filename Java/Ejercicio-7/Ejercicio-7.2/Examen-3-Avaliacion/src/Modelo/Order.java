/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 * implementa un pedido que se fai no restaurante
 * @author daw1al13
 */
public class Order {
    private int mesaNumber;
    private ArrayList<OrderItem> pedido;

    public int getMesaNumber() {
        return mesaNumber;
    }

    public void setMesaNumber(int mesaNumber) {
        this.mesaNumber = mesaNumber;
    }

    public ArrayList<OrderItem> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<OrderItem> pedido) {
        this.pedido = pedido;
    }

    public Order(int mesaNumber) {
        this.mesaNumber = mesaNumber;
        this.pedido = new ArrayList<OrderItem>() ;
    }
    /**
     *  devolve o prezo do pedido, calculándoo como a suma de todos os elementos do pedido
     * @return 
     */
    public double getPrice(){
        double price=0;
        for (int i = 0; i < pedido.size(); i++) {
            price += pedido.get(i).getPrice();
        }
        return price;
    }
}
