/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3_3_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *Clase DataBase para hacer una base de clientes que guarde los clientes en un array y los use
 * @author daw1al13
 */
public class DataBase {

    //Array List de objetos Client
    private ArrayList<Client> Clients  =new ArrayList<>();
    //Scanner
    Scanner scan = new Scanner(System.in);
    
    /**
     * Metodo para añadir a los clientes automaticamente en el array guardados
     * con sus respectivos atributos
     */
    private void addClient(){
        //Le pedimos al usuario que introduzca los atributos del Client
        System.out.println("Hola usuario introduze tus datos");
        System.out.println("Dime tu nif -----> ");
        String nif = scan.nextLine();
        System.out.println("Dime tu nombre -----> ");
        String name = scan.nextLine();
        System.out.println("Dime tus apellidos -----> ");
        String surname = scan.nextLine();

        //Creamos un Client con dichos atributos
        Client client = new Client(nif,name,surname);
        //Y lo añadimos al arrayList
        Clients.add(client);
    }
    
    /**
     * Metodo para mostrar los clientes por pantalla recorre todo el array y va mostrando su nif
     */
    private void showClients(){
        //Recorre el array
        for (int i=0 ; i<Clients.size(); i++){
            Client client = Clients.get(i);//Obtiene el cliente en el que estamos en el array
            String nif = client.getNif();//Crea una string nif que va a valer el valor del nif del cliente
            System.out.println("Cliente numero : "+(i+1)+" su nif es = "+nif);//Muesta el numero del cliente y su nif
        }
    }
    /**
     * Metodo para borrar objetos Client introduciendo su nif 
     * @param nif
     */
    private void removeClient(String nif){
        //Un booleano para reconocer si ese nif existe
        boolean checkNifExist= false;
        //Recorremos un bucle for por lo largo del array list
        for (int i=0 ; i<Clients.size(); i++){
            Client client = Clients.get(i);//Obtenemos un cliente 
            if (client.getNif().equals(nif)){//Comparamos su nif con el introducido en el metodo
                Clients.remove(client);//Si es true se borra ese cliente
                System.out.println("Cliente borrado !!!");//Muestra que a borrado algo
                checkNifExist = true;//Confirma que existe el nif
            }
            
        }
        //Si no se confirma que exista el nif entonces imprime que no hay ninguna coincidencia
        if(!checkNifExist){
            System.out.println("El nif no coincide con ningun cliente");
        }
    }
    /**
     * Metodo que mide el numero de clientes atraves del .size()
     * @return Client.size()
     */
    private int numClients(){
        return Clients.size();
    }
    /**
     * Metodo get que retorna clientes
     * @return Clients
     */
    public ArrayList<Client> getClients() {
        return Clients;
    }
    /**
     * Metodo set que establece clientes
     * @param Clients
     */
    public void setClients(ArrayList<Client> Clients) {
        this.Clients = Clients;
    }
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo un objeto database para poder usar sus metodos
         DataBase database = new DataBase();
         //Scanner
         Scanner scan = new Scanner(System.in);
         //Creamos un cliente
         System.out.println("Vamos a introducir el primer usuario : ");
         System.out.println("---------------");
         database.addClient();
         //Creamos otro cliente
         System.out.println("Vamos a introducir el segundo usuario : ");
         System.out.println("---------------");
         database.addClient();
         //Mostramos los usuarios por pantalla con su dni
         System.out.println("Vamos a mostrar a los usuarios : ");
         System.out.println("---------------");
         database.showClients();
         //Decimos el numero de usuarios que tiene la base de datos
         System.out.println("La base de datos tiene un total de : "+database.numClients());
         //Pedimos un nif para usar el metodo remove client
         System.out.println("Dime un nif para borrar su cliente : ");
         String nif = scan.nextLine();
         database.removeClient(nif);
         //Mostramos los usuarios por pantalla con su dni para mostrar que se borro 1
         System.out.println("Vamos a mostrar a los usuarios : ");
         System.out.println("---------------");
         database.showClients();
         //Decimos el numero de usuarios que tiene la base de datos
         System.out.println("La base de datos tiene un total de : "+database.numClients());
         
         // Client client = database.getClients().get(0); Manera de usar atributos del metodo desde el propio main
         
    }
    
}
