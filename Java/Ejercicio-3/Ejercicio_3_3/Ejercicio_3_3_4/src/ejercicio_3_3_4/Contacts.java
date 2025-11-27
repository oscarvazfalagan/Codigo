/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3_3_4;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author daw1al13
 */
public class Contacts {
    Scanner scan = new Scanner(System.in);
    HashMap<Integer,Client> phonebook = new HashMap();
    
    private void insert(int tel,Client cli){

        
    }
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
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Creo un objeto database para poder usar sus metodos
         Contacts contact = new Contacts();
         //Creamos un cliente
         System.out.println("Vamos a introducir el primer usuario : ");
         System.out.println("---------------");
         contact.addClient();
    }
    
}
