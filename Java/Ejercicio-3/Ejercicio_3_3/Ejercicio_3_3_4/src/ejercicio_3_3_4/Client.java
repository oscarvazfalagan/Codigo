/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3_3_4;

/**
 *Clase Client que crea client que se usaran para almacenar contacts
 * @author daw1al13
 */
public class Client {
    //Atributos
    private String nif;
    private String name;
    private String surname;
   
    /**
     * Metodo get que devuelve el valor de nif
     * @return nif
     */
    public String getNif() {
        return nif;
    }
    /**
     * Metodo set que establece el valor del nif
     * @param nif 
     */
    public void setNif(String nif) {
        this.nif = nif;
    }
    /**
     * Metodo get que devuelve el valor del nombre
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Metodo set que establece el valor del nombre
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Metodo get que devuelve el valor del apellido
     * @return surname
     */
    public String getSurname() {
        return surname;
    }
    /**
     * Metodo get que establece el valor del appellido
     * @param surname 
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    
    /**
     * Constructor que crea un cliente y le da los valores asignados a los atributos
     * @param nif
     * @param name
     * @param surname 
     */
    public Client(String nif, String name, String surname) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
    }
    
    
}
