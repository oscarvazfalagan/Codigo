/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 * implementa un elemento dun pedido.
 * @author daw1al13
 */
public class OrderItem {
    private MenuItem carta;
    private int cantidade;

    public OrderItem(MenuItem carta, int cantidade) {
        this.carta = carta;
        this.cantidade = cantidade;
    }

    public MenuItem getCarta() {
        return carta;
    }

    public void setCarta(MenuItem carta) {
        this.carta = carta;
    }

    public int getCantidade() {
        return cantidade;
    }

    public void setCantidade(int cantidade) {
        this.cantidade = cantidade;
    }
    /**
     * devolve o prezo do elemento do pedido, multiplicando o prezo do elemento do menú pola cantidade.
     * @return 
     */
    public double getPrice(){
        double price = carta.getPrezo()*cantidade;
        return price;
    }
}
