/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_3;

/**
 * Clase conserje que obtiene los atributos de una persona
 * @author daw1al13
 */
public class Concierge extends Person implements Speaker{
    //Atributos privados propios del conserje
    private String turn;
    private int seniority;
    
    /**
     * Obtiene el turno en el que trabaj el conserje
     * @return turn
     */
    public String getTurn() {
        return turn;
    }
    
    /**
     * Establece el turno en el que trabaja el conserje
     * @param turn 
     */
    public void setTurn(String turn) {
        this.turn = turn;
    }
    
    /**
     * Obtiene la antiguedad del conserge
     * @return seniority
     */
    public int getSeniority() {
        return seniority;
    }

    /**
     * Establece el valor de la antiguedad del conserje
     * @param seniority 
     */
    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }
    
    /**
     * Constructor de la clase Concierge que usa sus atributos para construir un objeo conserje
     * @param turn
     * @param seniority
     * @param name
     * @param age 
     */
    public Concierge(String turn, int seniority, String name, int age) {
        super(name, age);
        this.turn = turn;
        this.seniority = seniority;
    }
    
    /**
     * Metodo sobre escrito que expresa los valores de un conserje
     */
    @Override
    public void speak() {
        System.out.println("Ola, son un Conserje e sei falar.");
        System.out.print("Nombre : " + this.name);
        System.out.println("  Antiguedad : " + this.seniority);
        System.out.print("Edad : " + this.age);
        System.out.println("  Turno : " + this.turn);
        System.out.println("");
    }

}
