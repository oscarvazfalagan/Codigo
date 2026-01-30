/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_3;

/**
 *
 * @author daw1al13
 */
public class Tweety extends Canary implements Speaker{

    private int numberOfFilms;

    public int getNumberOfFilms() {
        return numberOfFilms;
    }

    public void setNumberOfFilms(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }

    public Tweety(int numberOfFilms, String sing, String Sex, int age) {
        super(sing, Sex, age);
        this.numberOfFilms = numberOfFilms;
    }


    @Override
    public void speak() {
        System.out.println("Ola, son Piolin e sei falar.");
        System.out.print("Sexo : " + this.sex);
        System.out.println("  Cancion : " + this.sing);
        System.out.print("Edad : " + this.age);
        System.out.println("  Numero de peliculas : " + this.numberOfFilms);
        System.out.println("");
    }

}
