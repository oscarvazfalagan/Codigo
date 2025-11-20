/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicicio_3_2_2;

/**
 *
 * @author daw1al13
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos dos objetos Matrix
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        // Los mostramos por pantalla
        matrix1.obtainMatrix();
        matrix2.obtainMatrix();
        System.out.println("Matriz 1 : ");
        System.out.println("------------");
        matrix1.showMatrix();
        System.out.println("");
        System.out.println("Matriz 2 : ");
        System.out.println("------------");
        matrix2.showMatrix();
        System.out.println("");
        // Realizamos la suma de las dos matrices
        System.out.println("Matriz suma : ");
        System.out.println("------------");
        Matrix resultadoSum = matrix1.sum(matrix2);
        resultadoSum.showMatrix();
        // Realizamos la resta de las dos matrices
        System.out.println("Matriz resta : ");
        System.out.println("------------");
        Matrix resultadoRes = matrix1.subtract(matrix2);
        resultadoRes.showMatrix();
    }

}
