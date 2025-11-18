/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicicio_3_2_1;
import java.util.Scanner;
/**
 * Clase Matrix que permite crear una matriz 3x3 y realizar sumas con otras matrices
 * @author daw1al13
 */
public class Matrix {
    Scanner scan = new Scanner(System.in);// Objeto Scanner para entrada de datos
    private int matrix[][] = new int[3][3];// Cada objeto sera una matriz 3x3

    /**
     *  Metodo privado para obtener los numeros de la matriz con un scanner
     */
    private void obtainMatrix() {
        // Texto introductivo
        System.out.println("Vas a introduzir una matriz 3x3  : ");
        System.out.println("--------------------------------------------------------");
        // Bucle que recore la matriz introduciendo los valores
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("Inroduce el numero de la posicion "+(i + 1)+":"+(j + 1)+" =");
                matrix[i][j] = scan.nextInt();
            }
        }
    }
    /**
     * Metodo para mostrar la matriz por pantalla
     */
    public void showMatrix(){
        // Muestra los valores de la matriz asignados a cada posicion recoorriendo el bucle
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
    }

    /**
     * Constructor que usa el metodoo obtainMatrix para inicializar la matriz
     */
    public Matrix() {
        obtainMatrix();
    }
    /**
     * Metodo get para obtener la matriz
     * @return
     */
    public int[][] getMatrix() {
        return matrix;
    }
    /**
     *  Metodo para sumar la matriz actual con otra matriz que le pasas como parametro
     * @param matrixSum
     */
    public void sum(int matrixSum[][]){
        // Matriz resultado donde se guardara la suma de matrices
        int matrixRes[][] = new int [3][3]; 
        // Bucle que recorre las dos matrices sumandolas y guardando el resultado en la matriz resultado
       for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            matrixRes[i][j] =matrix[i][j]+ matrixSum[i][j];//Suma las dos matrices y guarda el resultado
            System.out.print(matrixRes[i][j] + "    ");// Muestra el resultado por pantalla
            }
            System.out.println();
        }
    }
    
}
