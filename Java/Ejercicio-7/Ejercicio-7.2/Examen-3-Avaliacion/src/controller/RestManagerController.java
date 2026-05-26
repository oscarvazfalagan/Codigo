/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Modelo.Order;
import Modelo.OrderItem;
import db.OrderDB;
import java.util.ArrayList;
import view.OrderDetailManageView;
import view.OrderManageView;
import view.RestManagerView;

/**
 * implementa a controladora que xestiona o fluxo da aplicación
 *
 * @author daw1al13
 */
public class RestManagerController {

    private RestManagerView view;

    public RestManagerController() {
        view = new RestManagerView(this);
    }

    /**
     * Inicia la app llamando el loop a la vista
     */
    public void intApp() {
        while (!view.showInitMenu()) {

        }
    }

    /**
     * Este método permite completar os elementos para un novo pedido ou para un
     * pedido xa existente.
     *
     * @param numberMesa
     */
    public void completeOrder(int numberMesa) {
        if (OrderDB.findByTable(numberMesa) == null) {
            Order newOrder = new Order(numberMesa);
            OrderDB.save(newOrder);
        }

        while (view.askOrderItem() != 0) {
            OrderItem item = OrderDB.findByTable(numberMesa).getPedido().get(view.askOrderItem());
            if (item != null) {
                item.setCantidade(item.getCantidade() + 1);
                OrderDB.updateItem(OrderDB.findByTable(numberMesa), item);
            } else {
                item.setCantidade(1);
                OrderDB.save(OrderDB.findByTable(numberMesa));
            }

        };

    }

    /**
     * Este método recibe como parámetro un número de mesa, obtén o pedido
     * asociado a ela e chama ao método "showOrderItems" da vista para mostrar
     * os seus elementos.
     *
     * @param numeroMesa
     */
    public void showOrder(int numeroMesa) {
        view.shoOrderItems(OrderDB.findByTable(numeroMesa));
    }

    public static void main(String[] args) {
        RestManagerController main = new RestManagerController();
        main.intApp();
    }

    public void showOrders() {
        new OrderManageView(this);
    }
    public ArrayList<Order> refreshOrders(){
        return OrderDB.getAllOrders();
    }
    
    
    public void showOrderDetails(Order order){
        new OrderDetailManageView(this,order);
    }
    
    public void removeOrderItem(Order order,int index){
        int cantidad = order.getPedido().get(index).getCantidade();
        if(cantidad == 1){
            OrderDB.removeOrder(cantidad);
        }else{
            OrderDB.decreaseOrderItem(order,order.getPedido().get(index));
        }
        
    }
}
