/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2_9_1;

/**
 *
 * @author daw1al13
 */
public class Pen {
    private int ink = 30;
    private String Word = "Chispi";


    public int getInk() {
        return ink;
    }

    public void setInk(int ink) {
        this.ink = ink;
    }

    public void write (int words){
        if (ink > words){
            for (int i = words ;i>=0;i--){
                System.out.println(Word);
                this.ink -= 1 ;
            }
        }else {
            System.out.println("No queda tinta");
        }
    }
}

