/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_1_1;

/**
 *
 * @author daw1al13
 */
import java.util.Scanner;

/**
 * Programa calcula suma de dúas matrices
 *
 * @author Profe de programación
 */
public class Matrix {

    // Array bidimensional para almacenar os números da matriz
    private int values[][] = new int[3][3];

    /**
     * Constructor de la clase matrix si no le pasas parametros usa el metodo
     * fill
     */
    public Matrix() {
        fill();
    }

    /**
     * Constructir de la clase Matrix que rellena la matriz solo cuando
     * defaultValues = True sumando filas y columnas
     *
     * @param defaultValues
     */
    public Matrix(boolean defaultValues) {
       if (defaultValues) {
            for (int i = 0; i < values.length; i++) {
                for (int j = 0; j < values[i].length; j++) {
                    values[i][j] = i + j;
                }
            }
        }
    }

    /**
     * Obtén os números da matriz
     *
     * @return Array bidimensional cos números da matriz
     */
    public int[][] getValues() {
        return values;
    }

    /**
     * Establece os números da matriz
     *
     * @param values Array bidimensional cos números da matriz
     */
    public void setValues(int[][] values) {
        this.values = values;
    }

    /**
     * Pide os valores para a matriz
     */
    public void fill() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print("Introduza o elemento " + i + " " + j + ":");
                values[i][j] = scanner.nextInt();
            }
        }
    }

    /**
     * Mostra os valores para a matriz
     */
    public void show() {
        for (int[] row : values) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    /**
     * Obtén a suma da matriz coa matriz recibida como parámetro
     *
     * @param matrix Matriz a sumar
     * @return Matriz resultado da suma
     */
    public Matrix sum(Matrix matrix) {
        Matrix result = new Matrix();
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                result.getValues()[i][j] = matrix.getValues()[i][j] + values[i][j];
            }
        }
        return result;
    }

    /**
     * Obtén a suma da matriz consigo mismo si no le introduces ningun parametro
     *
     * @param matrix Matriz a sumar
     * @return Matriz resultado da suma
     */
    public Matrix sum() {
        Matrix result = new Matrix();
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                result.getValues()[i][j] = values[i][j] + values[i][j];
            }
        }
        return result;

    }

    /**
     * O método principal crea dous obxecto "Matriz" e invoca os métodos para
     * pedir os valores e obter a suma
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Introduce os valores da primeira matriz:");
        Matrix matrix1 = new Matrix();
        matrix1.fill();
        System.out.println("Introduce os valores da segunda matriz:");
        Matrix matrix2 = new Matrix();
        matrix2.fill();
        System.out.println("A matriz suma das dúas matrices é:");
        matrix1.sum(matrix2).show();
    }
}
