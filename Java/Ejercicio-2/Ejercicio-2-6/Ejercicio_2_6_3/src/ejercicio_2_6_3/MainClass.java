/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_6_3;

/**
 * clase main para ejecutar la tabla del 5 mediante bucle for
 *
 * @author daw1al13
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos variables para guadar resultado y darle valor a tabla
        int tabla = 5;
        int resultado = 0;
        //Bucle para que se realize la multiplicacion 10 vezes
        for (int n = 1; n <= 10; n++) {
            resultado = tabla * n;
            System.out.println(tabla + " x " + n + " = " + resultado);
        }
    }

}
