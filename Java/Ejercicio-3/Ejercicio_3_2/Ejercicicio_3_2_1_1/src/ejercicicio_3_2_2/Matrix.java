/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicicio_3_2_2;
import java.util.Scanner;
/**
 *
 * @author daw1al13
 */
public class Matrix {
    Scanner scan = new Scanner(System.in);
    private int matrix[][] = new int[3][3];
    private void obtainMatrix() {
        System.out.println("Vas a introduzir una matriz 3x3  : ");
        System.out.println("--------------------------------------------------------");
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("Inroduce el numero de la posicion "+(i + 1)+":"+(j + 1)+" =");
                matrix[i][j] = scan.nextInt();
            }
        }
    }
    public void showMatrix(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
    }
    
    public Matrix() {
        obtainMatrix();
    }

    public int[][] getMatrix() {
        return matrix;
    }
    
    public void sum(int matrixSum[][]){
        int matrixRes[][] = new int [3][3]; 
       for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            matrixRes[i][j] =matrix[i][j]+ matrixSum[i][j];
            System.out.print(matrixRes[i][j] + "    ");
            }
            System.out.println();
        }
       
    }
    public void subtract(int matrixrest[][]){
        int matrixRes[][] = new int [3][3]; 
       for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            matrixRes[i][j] =matrix[i][j] - matrixrest[i][j];
            System.out.print(matrixRes[i][j] + "     ");
            }
            System.out.println();
        }
       
    }
}
