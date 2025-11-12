/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3_1_3;
import java.util.Scanner;
/**
 *
 * @author daw1al13
 */
public class Statistics {
    Scanner scan = new Scanner(System.in);
    private int numbers[];
    
    private void getNumbers() {
        System.out.println("Introduce 10 notas : ");
        System.out.println("---------------------");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce la nota " + (i + 1) + " : ");
            numbers[i] = scan.nextInt();

        }
    }

    public Statistics(int n) {
        if (n%2 != 0) {
            this.numbers = new int[n];
            getNumbers();
        }
        else {
            System.out.println("No se puede ejecutar");
        }
    }
    
    public int median(){
        int mediana = 0;
        for (int i = 0; i < numbers.length; i++) {
            int contadorMin = 0;
            int contadorMax = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i]>numbers[j]){
                    contadorMin = contadorMin + 1;
                }
                if (numbers[i]<numbers[j]){
                    contadorMax = contadorMax + 1;
                }
                
            }
            if (contadorMax == contadorMin){
                    mediana = numbers[i];
                }
        }
        return mediana;
    }

}
