/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_3;

/**
 *
 * @author daw1al13
 */
public class Concierge extends Person {
    private String Turn;
    private String Seniority;

    public String getTurn() {
        return Turn;
    }

    public void setTurn(String Turn) {
        this.Turn = Turn;
    }

    public String getSeniority() {
        return Seniority;
    }

    public void setSeniority(String Seniority) {
        this.Seniority = Seniority;
    }

    public Concierge(String Turn, String Seniority, String Name, int Age) {
        super(Name, Age);
        this.Turn = Turn;
        this.Seniority = Seniority;
    }
    
}
