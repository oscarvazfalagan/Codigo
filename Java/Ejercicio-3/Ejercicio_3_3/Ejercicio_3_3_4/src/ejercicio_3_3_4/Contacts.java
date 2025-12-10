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

    //Atributo Hashmap con clientes
    private HashMap<Integer, Client> phonebook = new HashMap();
    /**
     * Getter del hasmap para recibir un phonebook
     * @return 
     */
    public HashMap<Integer, Client> getPhonebook() {
        return phonebook;
    }
    /**
     * setter para establecerle los valores del phonebook
     * @param phonebook 
     */
    public void setPhonebook(HashMap<Integer, Client> phonebook) {
        this.phonebook = phonebook;
    }

    /**
     * Metodo para añadir a los contactos automaticamente en el hasmap guardados
     * con sus respectivos atributos y telefono
     */
    private void insert(int tel, Client cli) {
        phonebook.put(tel, cli);
    }
    /**
     * Metodo para borrar un contacto introduciendo el telefono
     * @param tel 
     */
    private void remove(int tel) {
        phonebook.remove(tel);
    }
    /**
     * Metodo para encontrar un usuario introduciendo su numero
     * @param tel
     * @return client
     */
    private Client findByNumber(int tel) {
        Client client = phonebook.get(tel);
        return client;
    }
    /**
     * Metodo para saber el numero de telefono que tienes guardados
     * @return 
     */
    private int numContacts(){
        return phonebook.size();
    }
    /**
     * Metodo para añadir a los clientes automaticamente en el array guardados
     * con sus respectivos atributos
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        //Creo un objeto database para poder usar sus metodos
        Contacts contact = new Contacts();
        
        
        
        //Creamos un cliente
        System.out.println("Vamos a introducir el primer usuario de tu agenda : ");
        System.out.println("---------------");
        //Le pedimos al usuario que introduzca los atributos del Client
        System.out.println("Hola usuario introduce tus datos");
        System.out.println("Dime el nif -----> ");
        String nif = scan.nextLine();
        System.out.println("Dime el nombre -----> ");
        String name = scan.nextLine();
        System.out.println("Dime los apellidos -----> ");
        String surname = scan.nextLine();
        //Creamos un Client con dichos atributos y le añadimos el numero
        Client client1 = new Client(nif, name, surname);
        System.out.println("Dime tu numero -----> ");
        int telf = scan.nextInt();
        scan.nextLine();
        contact.insert(telf, client1);
        //Introduimos el segundo usuario
        System.out.println("");
        System.out.println("Vamos a introducir el segundo usuario : ");
        System.out.println("---------------");
        //Le pedimos al usuario que introduzca los atributos del Client
        System.out.println("Hola usuario introduce los datos");
        System.out.println("Dime el nif -----> ");
        nif = scan.nextLine();
        System.out.println("Dime el nombre -----> ");
        name = scan.nextLine();
        System.out.println("Dime los apellidos -----> ");
        surname = scan.nextLine();
        //Creamos un Client con dichos atributos
        Client client2 = new Client(nif, name, surname);
        System.out.println("Dime tu numero -----> ");
        telf = scan.nextInt();
        contact.insert(telf, client1);
        //Narramos la cantidad de contactos que tiene la agenda
        System.out.println("Tu agenda tiene un total de : "+ contact.numContacts() +" personas");
        //Pedimos un numero para localizar un cliente
        System.out.println("Dime un numero que sepas para que te devuelva el cliente -->");
        telf = scan.nextInt();
        Client clientx =contact.findByNumber(telf);
        System.out.println("La persona asociada a este telefono es "+ clientx.getName());
        //Pide un numero para eliminar al usuario arraigado al numero
        System.out.println("Vamos a borrar un contacto introduce su numero ------->");
        telf = scan.nextInt();
        contact.remove(telf);
        //Vuelve a mostrar el numero de usuarios que existen
        System.out.println("Tu agenda tiene un total de : "+ contact.numContacts() +" personas");
    }

}
