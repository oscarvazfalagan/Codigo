/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7.pkg1.pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * Clase main que escanea linea por linea y añade el numero de linea al principio
 * lo devuelve creando un archivo .lines
 *
 * @author daw1al13
 */

public class MainApp {
    /**
     * 
     * 
     * @param sourceFilePath
     * @throws IOException 
     */
    public void lineAdder(String sourceFilePath)throws IOException {
        try (BufferedReader in = new BufferedReader(new FileReader(sourceFilePath)); 
                BufferedWriter out = new BufferedWriter(new FileWriter(sourceFilePath+".lines"))) {
            // Usamos os métodos readLine, write e writeLine para ler e escribir
            // liña a liña
            //Creamos un contador para que aparezcan el numero de lineas
            int lineCount = 0;
            String line;
            while ((line = in.readLine()) != null) {
                lineCount++;
                out.write(lineCount+". "+line);
                out.newLine();
            }
            // Non sería necesario, pero forzamos o volcado do buffer ao rematar
            out.flush();
        }    
            System.out.println("Completado");
    }

    /**
     *
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        MainApp main = new MainApp();
        //El main funciona en base a los parametros del args 
        main.lineAdder(args[0]);
        
    }

}
