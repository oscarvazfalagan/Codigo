package view;

import Modelo.Order;
import Modelo.OrderItem;
import controller.RestManagerController;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * implementa a vista co menú de texto da aplicación
 * @author daw1al13
 */
public class RestManagerView {

    private RestManagerController controller;

    public RestManagerView(RestManagerController controller) {
        this.controller = controller;
    }
    /**
     *  Este método mostra as opcións do menú da aplicación
     * @return 
     */
    public boolean showInitMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                           Benvido a RestManager
                           1. Engadir elementos a un pedido
                           2. Mostrar un pedido
                           3. Cobrar pedidos
                           4. Sair
                           """);
        System.out.println("Introduce unha opcion : ");
        int optionSelected = scan.nextInt();
        scan.nextLine();
        switch (optionSelected) {
            case 1:
                System.out.println("Introduce o numero de unha mesa : ");
                int numberMesa = scan.nextInt();
                scan.nextLine();
                controller.completeOrder(numberMesa);
                return false;
            case 2:
                System.out.println("Introduce o numero de unha mesa : ");
                int numberOfMesa = scan.nextInt();
                scan.nextLine();
                controller.showOrder(numberOfMesa);
                return false;
            case 3:
                 controller.showOrders();
                return false;
            case 4:
                return true;
            default:
                return false;
        }
    }
    /**
     *  Este método pide ao usuario que introduce o número dun elemento da carta,
     *  ou cero se non quere introducir máis elementos, e devolve o número introducido polo usuario.
     * @return 
     */
    public int askOrderItem() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el numero de un elemento de la carta (Pulsa 0 para salir)");
        int numberItem = scan.nextInt();
        scan.nextLine();
        return numberItem;
    }
    /**
     * Este método simplemente mostra unha mensaxe por pantalla indicando que non se atopou un elemento da carta con ese número.
     */
    public void showItemNotFoundMessage() {
        System.out.println("No se encontro este elemento en la carta");
    }
    /**
     * Este método recibe como parámetro un pedido e, se non é nulo, 
     * mostra todos os elementos do pedido coa súa cantidade e descrición, así como o prezo total do pedido.
     * @param pedido 
     */
    public void shoOrderItems(Order pedido) {
        if (pedido != null) {
            System.out.println("Elementos do pedido : ");
            for (OrderItem pedido1 : pedido.getPedido()) {
                System.out.println("- " + pedido1.getCantidade() + pedido1.getCarta().getDescripcion() + pedido1.getCarta().getPrezo());
            }
        } else {
            System.out.println("No hay ningun pedido en esta mesa");
        }
    }
}
