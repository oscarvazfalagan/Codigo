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
    public static final int MAX=24;
    public int min=1;
    
    
    public void fill() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int value;
                do {
                    value = (new java.util.Random().nextInt(MAX)) + 1;

                } while (checker(value) == true);
                matrix[i][j] = value;
            }
        }
        
    }

    private boolean checker(int value) {

        boolean confirm = false;
        
        for (int i = 0; i < matrix.length && !confirm; i++) {
            for (int j = 0; j < matrix[i].length && !confirm; j++) {
                if (value == matrix[i][j]) {
                    confirm = true;
                }
            }
        }
        return confirm;
    }

    public void show() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
    }
    
    public void eat(){
        
        
        
         for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == MIN){
                    matrix[i][j] = 0;
                }
            }
        }
        this.MIN++;
    }
}
