/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3_3_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author daw1al13
 */
public class DataBase {
        
    private ArrayList<Client> Clients  =new ArrayList<>();
    
    Scanner scan = new Scanner(System.in);
    
    private void addClient(){
        System.out.println("Hola usuario introduze tus datos");
        System.out.println("Dime tu nif -----> ");
        String nif = scan.nextLine();
        System.out.println("Dime tu nombre -----> ");
        String name = scan.nextLine();
        System.out.println("Dime tus apellidos -----> ");
        String surname = scan.nextLine();
        
        Client client = new Client(nif,name,surname);
        Clients.add(client);
    }
    
    
    private void showClients(){
        for (int i=0 ; i<Clients.size(); i++){
            Client client = Clients.get(i);
            String nif = client.getNif();
            System.out.println("Cliente numero : "+(i+1)+" su nif es = "+nif);
        }
    }
    
    private void removeClient(String nif){
        boolean checkNifExist= false;
        for (int i=0 ; i<Clients.size(); i++){
            Client client = Clients.get(i);
            if (client.getNif().equals(nif)){
                Clients.remove(client);
                System.out.println("Cliente borrado !!!");
                checkNifExist = true;
            }
            
        }
        if(!checkNifExist){
            System.out.println("El nif no coincide con ningun cliente");
        }
    }
    
    private int numClients(){
        return Clients.size();
    }

    public ArrayList<Client> getClients() {
        return Clients;
    }

    public void setClients(ArrayList<Client> Clients) {
        this.Clients = Clients;
    }
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         DataBase database = new DataBase();
         Scanner scan = new Scanner(System.in);
         System.out.println("Vamos a introducir el primer usuario : ");
         System.out.println("---------------");
         database.addClient();
         System.out.println("Vamos a introducir el segundo usuario : ");
         System.out.println("---------------");
         database.addClient();
         System.out.println("Vamos a mostrar a los usuarios : ");
         System.out.println("---------------");
         database.showClients();
         System.out.println("La base de datos tiene un total de : "+database.numClients());
         System.out.println("Dime un nif para borrar su cliente : ");
         String nif = scan.nextLine();
         database.removeClient(nif);
         System.out.println("Vamos a mostrar a los usuarios : ");
         System.out.println("---------------");
         database.showClients();
         System.out.println("La base de datos tiene un total de : "+database.numClients());
         
         // Client client = database.getClients().get(0); Manera de usar atributos del metodo desde el propio main
         
    }
    
}
