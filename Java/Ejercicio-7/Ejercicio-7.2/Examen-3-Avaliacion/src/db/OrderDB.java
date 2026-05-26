/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import Modelo.MenuItem;
import Modelo.Order;
import Modelo.OrderItem;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * implementar a persistencia dos pedidos e dos elementos da carta
 * @author daw1al13
 */
public class OrderDB {
    private static final Connection conection= null ;
    private static final HashMap<Integer, Order> pedidos = new HashMap<Integer, Order>();
    private static final MenuItem[] menu = new MenuItem[]{
        new MenuItem(1, "Spaguetti Carbonara", 12.50),
        new MenuItem(2, "Pizza catro queixos mediana", 11.90),
        new MenuItem(3, "Cocacola 33 cl", 2.5),
        new MenuItem(4, "Auga 1l", 3)
    };
    private static void closeConnection() throws IOException, SQLException{
        if(conection!= null){
            conection.close();
        }
    }
    private static void getConnection() throws SQLException{
        OrderDB db = new OrderDB();
        if(conection == null){
           java.sql.Connection c = DriverManager.getConnection("jdbc:sqlite:rest.db");
           
        }
    }
    /**
     * devolve un elemento da carta a partir do Id que recibe como parámetro, ou null se non se atopa ningún elemento na carta con ese Id.
     * @param id
     * @return 
     */
    public MenuItem findById(int id){
        if(menu[id]!=null) {
            return menu[id];
        }
        return null;
    }    
    
    public static Order findByTable(int mesaNumber){
        if(pedidos.get(mesaNumber)!=null){
           return pedidos.get(mesaNumber);
        }
        return null;
    }
    /**
     * Que garda o pedido recibido no HashMap de pedidos, poñendo o número de mesa como chave.
     * @param pedido 
     */
    public static final void save(Order pedido){
       pedidos.put(pedido.getMesaNumber(),pedido);
    }
    /**
     * Que recibe como parámetros un pedido e un elemento do pedido e debe gardar o elemento do pedido
     * @param pedido
     * @param elementoPedido 
     */
    public static final void saveItem(Order pedido,OrderItem elementoPedido){
        //TODO
    }
    
    /**
     * Que recibe como parámetros un pedido e un elemento do pedido e debe actualizar o elemento do pedido
     * @param pedido
     * @param elementoPedido 
     */
    public static final void updateItem(Order pedido,OrderItem elementoPedido){
        //TODO
    }
    
    public static final ArrayList<Order> getAllOrders(){
        ArrayList<Order> AllOrders = new ArrayList<Order>();
        for (int i = pedidos.size();i>=1; i--) {
            AllOrders.add(pedidos.get(i));
        }
        return AllOrders;
    }

   public static final void removeOrder(int tableNumber){
       pedidos.remove(tableNumber);
   }
   
   public static final void removeOrderItem(Order order, OrderItem item){
       for (int i = 0; i < order.getPedido().size(); i++) {
           if(order.getPedido().get(i).equals(item)){
               order.getPedido().remove(i);
               break;
           }
       }
   }
   
   public static final void decreaseOrderItem (Order order, OrderItem item){
       item.setCantidade(item.getCantidade()-1);
   }
    
     
     
     
}
