/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_3;

import java.util.ArrayList;

/**
 * Main app para ejecutar las distintas clases
 * @author daw1al13
 */
public class MainApp {

    public static void main(String[] args) {

        Parrot loro = new Parrot("Albania", "Verde", "Hembra", 14);
        Tweety canario = new Tweety(6, "Canta mientras lava los platos", "Macho", 2);
        Student estudiante = new Student("Biologia", 3, "Alfredo", 17);
        Concierge conserje = new Concierge("Mañana", 10, "Lucifer", 30);
        TV tele = new TV(true, 100, 150000, 50);
        Radio radio = new Radio(false, 2, 50, 7500);
        Speaker[] speaker = {loro,canario,estudiante,conserje,tele,radio};
        
        for (int i=0;i < speaker.length;i++){
            speaker[i].speak();
            
        }
    }
}
