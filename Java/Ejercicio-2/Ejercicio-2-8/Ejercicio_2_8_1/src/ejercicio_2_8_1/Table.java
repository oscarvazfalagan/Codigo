/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2_8_1;

/**
 *Clase Table para hacer las tablas de multiplicar
 * @author oscar vaz falagan
 */
public class Table {
    private int number;
    
    /**
     * Devuelve el numero
     * @return number
     */
    public int getNumber() {
        return number;
    }
    /**
     * Establece el numero
     * @param number 
     */
    public void setNumber(int number) {
        this.number = number;
    }
    /**
     * Constructor de tablas
     * @param number 
     */
    public Table(int number) {
        this.number = number;
    }
    /**
     * Metodo show muestra la tabla del numero del 0 al 10
     */
    public void show(){
        int resultado;
        for (int n = 0; n <= 10; n++) {
            resultado = this.number * n;
            System.out.println(this.number + " x " + n + " = " + resultado);
        }
    }
}
