/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicicio_3_2_1;

/**
 *
 * @author daw1al13
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        System.out.println("Matriz 1 : ");
        System.out.println("------------");
        matrix1.showMatrix();
        System.out.println("");
        System.out.println("Matriz 2 : ");
        System.out.println("------------");
        matrix2.showMatrix();
        System.out.println("");
        System.out.println("Matriz suma : ");
        System.out.println("------------");
        matrix1.sum(matrix2.getMatrix());
       
    }
    
}
