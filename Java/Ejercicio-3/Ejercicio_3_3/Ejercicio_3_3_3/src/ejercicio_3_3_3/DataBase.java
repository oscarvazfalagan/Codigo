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
    
    
    private void showClient(){
        for (int i=0 ; i<Clients.size(); i++){
            Client client = Clients.get(i);
            String nif = client.getNif();
            System.out.println("Cliente numero : "+i+"");
        }
    }
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
    }
    
}
