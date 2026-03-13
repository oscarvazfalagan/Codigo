/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author daw1al13
 */
public class Teacher extends HogwartsCharacter {
    private String CV;

    public String getCV() {
        return CV;
    }

    public void setCV(String CV) {
        this.CV = CV;
    }

    public Teacher( String nome, String caracteristicas, String codigoHowarts,String casa, Pet mascota, String CV) {
        super(nome, caracteristicas, codigoHowarts, mascota, casa);
        this.CV = CV;
    }

}
