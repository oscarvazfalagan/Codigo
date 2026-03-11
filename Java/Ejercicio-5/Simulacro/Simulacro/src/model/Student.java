/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author daw1al13
 */
public class Student extends HogwartsCharacter {
    private String quidditch;
    private int curse;

    public Student(String nome, String caracteristicas, String codigoHowarts, String casa, Pet mascota, String quidditch, int curse) {
        super(nome, caracteristicas, codigoHowarts, mascota, casa);
        this.quidditch = quidditch;
        this.curse = curse;
    }

    public String getQuidditch() {
        return quidditch;
    }

    public void setQuidditch(String quidditch) {
        this.quidditch = quidditch;
    }

    public int getCurse() {
        return curse;
    }

    public void setCurse(int curse) {
        this.curse = curse;
    }


}
