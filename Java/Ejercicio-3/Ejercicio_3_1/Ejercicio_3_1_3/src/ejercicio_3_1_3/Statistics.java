/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3_1_3;

/**
 *
 * @author daw1al13
 */
public class Statistics {
    private int numbers[];
    
    private void getNumbers() {
        System.out.println("Introduce 10 notas : ");
        System.out.println("---------------------");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce la nota " + (i + 1) + " : ");
            

        }
    }

    public Statistics(int n) {
        if (n%2 != 0) {
            int numbers[] = new int[n];
            getNumbers();
        }
        else {
            System.out.println("No se puede ejecutar");
        }
    }


}
