/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author daw1al13
 */
public class HogwartsCharacter {
    private String nome;
    private String caracteristicas;
    private String codigoHowarts;
    private Pet mascota;
    private String casa;

    public HogwartsCharacter(String nome, String caracteristicas, String codigoHowarts, Pet mascota, String casa) {
        this.nome = nome;
        this.caracteristicas = caracteristicas;
        this.codigoHowarts = codigoHowarts;
        this.mascota = mascota;
        this.casa = casa;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getCodigoHowarts() {
        return codigoHowarts;
    }

    public void setCodigoHowarts(String codigoHowarts) {
        this.codigoHowarts = codigoHowarts;
    }

    public Pet getMascota() {
        return mascota;
    }

    public void setMascota(Pet mascota) {
        this.mascota = mascota;
    }
}
