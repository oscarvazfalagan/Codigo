/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7.pkg1.pkg1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase main que escanea los tokens y los divide en base a un delimitador
 *
 * @author daw1al13
 */

public class MainApp {
    /**
     *  Divide los tokens que recibe en base al parametro que recibe
     * @param sourceFilePath
     * @throws IOException 
     */
     public void tokensDivider(String sourceFilePath,String Delimiter)
            throws IOException {
        try (Scanner in = new Scanner(new BufferedReader(new FileReader(sourceFilePath)))) {
            // Establecemos como delimitador el parametro del main
            in.useDelimiter(Delimiter);
            // Lemos todos los tokens y mostramos todos por pantalla
            while (in.hasNext()) {
                System.out.println(in.next());
            }
        }
    }

    /**
     *
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        MainApp main = new MainApp();
        //El main funciona en base a los parametros del args 
        main.tokensDivider(args[0],args[1]);
        
    }

}
