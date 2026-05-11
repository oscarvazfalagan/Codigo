/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7.pkg2.pkg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase DataBase para hacer una base de clientes que guarde los clientes en un
 * array y los use
 *
 * @author daw1al13
 */
public class DataBase implements Serializable{

    //Array List de objetos client
   private ArrayList<Client> clients = new ArrayList<>();
   /**
    * Guarda todos los clientes en un archivo
    * @param clients
    * @param destFilePath
    * @throws FileNotFoundException
    * @throws IOException 
    */
   public void saveClients(ArrayList<Client> clients, String destFilePath) throws FileNotFoundException, IOException{
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(destFilePath))) {
            // Escribimos na saída os clientes
            out.writeObject(clients);
       }
    }
    /**
     * Metodo para añadir a los clientes automaticamente en el array guardados
     * con sus respectivos atributos
     */
    private void addClient() {
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Le pedimos al usuario que introduzca los atributos del Client
        System.out.println("Hola usuario introduze tus datos");
        System.out.println("Dime tu nif -----> ");
        String nif = scan.nextLine();
        System.out.println("Dime tu nombre -----> ");
        String name = scan.nextLine();
        System.out.println("Dime tus apellidos -----> ");
        String surname = scan.nextLine();

        //Creamos un Client con dichos atributos
        Client client = new Client(nif, name, surname);
        //Y lo añadimos al arrayList
        clients.add(client);
    }
    
    
    /**
     * Coje los clientes de el txt y los agrega al array list de clientes
     * si el txt no esta creado va a tirar una IOexception por lo tanto
     * haremos un catch vacio para que siga su ejecucion en caso de que sea
     * la primera vez que se ejecuta
     * 
     * 
     * @param sourceFilePath
     * @throws ClassNotFoundException 
     */
     public void clientLoad(String sourceFilePath) throws ClassNotFoundException{
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(sourceFilePath))) {
            // Insertamos la colecion de clientes a nuestra variable
             clients = (ArrayList<Client>) in.readObject();
        } catch (IOException ex) {
        }
    }

     /**
     * Metodo para mostrar los clientes por pantalla recorre todo el array y va
     * mostrando su nif
     */
    private void showClients() {
        //Recorre el array
        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);//Obtiene el cliente en el que estamos en el array
            String nif = client.getNif();//Crea una string nif que va a valer el valor del nif del cliente
            System.out.println("Cliente numero : " + (i + 1) + " su nif es = " + nif);//Muesta el numero del cliente y su nif
        }
    }

    /**
     * Metodo para borrar objetos Client introduciendo su nif
     *
     * @param nif
     */
    private void removeClient(String nif) {
        //Un booleano para reconocer si ese nif existe
        boolean checkNifExist = false;
        //Recorremos un bucle for por lo largo del array list
        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);//Obtenemos un cliente 
            if (client.getNif().equals(nif)) {//Comparamos su nif con el introducido en el metodo
                clients.remove(client);//Si es true se borra ese cliente
                System.out.println("Cliente borrado !!!");//Muestra que a borrado algo
                checkNifExist = true;//Confirma que existe el nif
                break;
            }
        }
        //Si no se confirma que exista el nif entonces imprime que no hay ninguna coincidencia
        if (!checkNifExist) {
            System.out.println("El nif no coincide con ningun cliente");
        }
    }

    /**
     * Metodo que mide el numero de clientes atraves del .size()
     *
     * @return Client.size()
     */
    private int numClients() {
        return clients.size();
    }

    /**
     * Metodo get que retorna clientes
     *
     * @return Clients
     */
    public ArrayList<Client> getClients() {
        return clients;
    }

    /**
     * Metodo set que establece clientes
     *
     * @param Clients
     */
    public void setClients(ArrayList<Client> Clients) {
        this.clients = Clients;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Creo un objeto database para poder usar sus metodos
        DataBase database = new DataBase();
        //Scanner
        Scanner scan = new Scanner(System.in);

        database.clientLoad("clients.txt");
    
            
        
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
        System.out.println("La base de datos tiene un total de : " + database.numClients());
        //Pedimos un nif para usar el metodo remove client
        System.out.println("Dime un nif para borrar su cliente : ");
        String nif = scan.nextLine();
        database.removeClient(nif);
        //Mostramos los usuarios por pantalla con su dni para mostrar que se borro 1
        System.out.println("Vamos a mostrar a los usuarios : ");
        System.out.println("---------------");
        database.showClients();
        //Decimos el numero de usuarios que tiene la base de datos
        System.out.println("La base de datos tiene un total de : " + database.numClients());
        database.saveClients(database.getClients(), "clients.txt");
        // Client client = database.getClients().get(0); Manera de usar atributos del metodo desde el propio main
    }

}
