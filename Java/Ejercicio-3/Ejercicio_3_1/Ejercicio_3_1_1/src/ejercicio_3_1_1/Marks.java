/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3_1_1;
import java.util.Scanner;
/**
 *
 * @author daw1al13
 */
public class Marks {
    Scanner scan = new Scanner(System.in);
    private int marks[] = new int[10];
    
    
    private void getMarks(){
        System.out.println("Introduce 10 notas : ");
        for (int i=0; i<marks.length ; i++){
            marks[i] = scan.nextInt();
            
        }
    }

    public Marks() {
        getMarks();
    }
    public void getAverage(){
        Double average = 0.0;
        for (int i=0; i<marks.length ; i++){
            average += marks[i];
        }
        System.out.println("La media de las notas es = "+ average/10);
        
    }
    
}
