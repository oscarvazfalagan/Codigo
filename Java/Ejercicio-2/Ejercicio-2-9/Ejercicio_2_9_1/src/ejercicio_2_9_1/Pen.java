/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2_9_1;

/**
 * Clase Pen que simula el comportamiento de un bolígrafo con tinta limitada
 * @author daw1al13
 */
public class Pen {
    //Atributos ink y Word
    private int ink = 30;
    private String Word = "Chispi";

    /**
     * Método para obtener la cantidad de tinta restante
     * @return  int cantidad de tinta restante
     */
    public int getInk() {
        return ink;
    }
    /**
     * Método para establecer la cantidad de tinta
     * @param ink cantidad de tinta a establecer
     */
    public void setInk(int ink) {
        this.ink = ink;
    }
    /**
     * Método para escribir palabras consumiendo tinta
     * @param words número de palabras a escribir
     */
    public void write (int words){
        //Comprobando si hay suficiente tinta para escribir las palabras
        if (ink > words){
            //Escribiendo las palabras y consumiendo tinta
            for (int i = words ;i>=0;i--){
                System.out.println(Word);
                this.ink -= 1 ;
            }
        }else {
            //Si no hay suficiente tinta, mostrar mensaje
            System.out.println("No queda tinta");
        }
    }
}

