/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_3;

/**
 * Clase canaria que obtiene los atributos de un pajaro
 * @author daw1al13
 */
public class Canary extends Bird {
    
    //Atributo cancion que pueden eredar los canarios
    protected String sing;
    
    /**
     * Constructor de la clase canary que usa sus atributos para construir un objeo canario
     * @param sing
     * @param Sex
     * @param age 
     */
    public Canary(String sing, String Sex, int age) {
//        super(Sex, age);
        this.sing = sing;
    }
    
    /**
     * Obtienes una string de cantar del canario
     * @return sing
     */
    public String getSing() {
        return sing;
    }
    
    /**
     * Establece el valor de cantar del canario
     * @param sing 
     */
    public void setSing(String sing) {
        this.sing = sing;
    }
}
