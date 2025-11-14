/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3_2_3;

/**
 *
 * @author daw1al13
 */
public class AdventCalendar {

    private int matrix[][] = new int[6][4];

    public void fill() {
        int MAX = 24;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                do {
                    int value = new java.util.Random().nextInt(MAX);
                    matrix[i][j] = value;
                    checker(value);
                    
                } while (checker != true);
            }
        }

    }
    private void checker(int value){
        int MAX = 24;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (value == matr)
            }
        }
    
    }

    public void show() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
