/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicicio_3_2_2;

import java.util.Scanner;

/**
 * Clase Matrix que permite crear una matriz 3x3 y realizar sumas con otras
 * matrices
 *
 * @author daw1al13
 */
public class Matrix {

   
    private int matrix[][] = new int[3][3];// Cada objeto sera una matriz 3x3

    /**
     * Metodo para obtener los numeros de la matriz con un scanner
     */
    public void obtainMatrix() {
         Scanner scan = new Scanner(System.in);// Objeto Scanner para entrada de datos
        // Texto introductivo
        System.out.println("Vas a introduzir una matriz 3x3  : ");
        System.out.println("--------------------------------------------------------");
        // Bucle que recore la matriz introduciendo los valores
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("Inroduce el numero de la posicion " + (i + 1) + ":" + (j + 1) + " =");
                matrix[i][j] = scan.nextInt();
            }
        }
    }

    /**
     * Metodo para mostrar la matriz por pantalla
     */
    public void showMatrix() {
        // Muestra los valores de la matriz asignados a cada posicion recoorriendo el
        // bucle
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(matrix1[j] + "    ");
            }
            System.out.println();
        }
    }



    /**
     * Metodo get para obtener la matriz
     *
     * @return
     */
    public int[][] getMatrix() {
        return matrix;
    }

    /**
     * Metodo para sumar la matriz actual con otra matriz que le pasas como
     * parametro
     *
     * @param matrixSum
     */
    public Matrix sum(Matrix matrixSum) {
        // Bucle que recorre las dos matrices sumandolas y guardando el resultado en la
        // matriz resultado
        Matrix matrixRes = new Matrix();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixRes.getMatrix()[i][j] = matrix[i][j] + matrixSum.matrix[i][j];// Suma las dos matrices y guarda el resultado
            }
        }
        return matrixRes;
    }

    /**
     * Metodo para resta la matriz actual con otra matriz que le pasas como
     * parametro
     *
     * @param matrixrest
     */
    public Matrix subtract(Matrix matrixResta) {
        
        Matrix matrixRes = new Matrix();
        //Bucle que recorre las dos matrices restandolas y guardando el resultado en la matriz resultado
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixRes.getMatrix()[i][j] = matrix[i][j] - matrixResta.matrix[i][j];
            }
        }
        return matrixRes;
    }



}
