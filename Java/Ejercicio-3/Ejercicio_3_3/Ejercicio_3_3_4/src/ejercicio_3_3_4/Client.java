/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3_3_3;

/**
 *
 * @author daw1al13
 */
public class Client {
    private String nif;
    private String name;
    private String surname;

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Client(String nif, String name, String surname) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
    }
    
    
}
