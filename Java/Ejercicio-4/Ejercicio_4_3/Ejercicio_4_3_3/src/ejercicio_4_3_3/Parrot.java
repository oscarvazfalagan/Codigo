/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_3;

/**
 *
 * @author daw1al13
 */
public class Parrot extends Bird implements Speaker{

    private String region;
    private String color;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Parrot(String region, String color, String sex, int age) {
        super(sex, age);
        this.region = region;
        this.color = color;
    }
    /**
     * Metodo sobre escrito que expresa los valores de un loro
     */
    @Override
    public void speak() {
        System.out.println("Ola, son un Loro e sei falar.");
        System.out.print("Sexo : " + this.sex);
        System.out.println("  Region : " + this.region);
        System.out.print("Edad : " + this.age);
        System.out.println("  Color : " + this.color);
        System.out.println("");
    }

}
