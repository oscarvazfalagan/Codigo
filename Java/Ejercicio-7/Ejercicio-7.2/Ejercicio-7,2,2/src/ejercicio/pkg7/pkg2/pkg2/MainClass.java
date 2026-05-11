/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7.pkg2.pkg2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

/**
 *
 * @author daw1al13
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        MainClass main = new MainClass();
        String fileName;
        String dirName;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime un fichero : ");
        fileName = scan.nextLine();
        System.out.println("Dime un directorio : ");
        dirName = scan.nextLine();
        
        
        
        main.readA(fileName);
    }
     
        
    
     public void readA(String sourceFilePath)
            throws IOException {
        try (Scanner in = new Scanner(new BufferedReader(new FileReader(sourceFilePath)))) {
            int contador=0;
            in.useDelimiter("");
            // Lemos todos os tokens del documento y contamos las a
            while (in.hasNext()) {
                if(in.next().equals("a")){
                    contador++;
                }
            }
            System.out.println("Numero total de a = "+contador);
        }
    }
    
}
