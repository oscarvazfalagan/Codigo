/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7.pkg1.pkg1;

import java.io.Console;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 *  Clase main que para sar codificar o descodificar en cesar
 * @author daw1al13
 */
public class MainApp {
    /**
     * El metodo obtiene los parametros de el tipo de cifrado que quieren ademas
     * de el archivo que quiere usar
     * @param typeOfCif
     * @param sourceFilePath
     * @throws IOException 
     */
    public void toolCifCesar(String typeOfCif, String sourceFilePath)
            throws IOException {
        // Declaramos os streams de entrada e saída
        InputStream in = null;
        OutputStream out = null;
        try {
            // Abrimos os streams
            in = new FileInputStream(sourceFilePath);
            Console console = System.console();
            System.out.println("Introduce el numero de posiciones que quieres aplicar :");
            int numCesar = Integer.parseInt(new String(console.readPassword()));
            int oneByte;
            //Esto es como se deberia de hacer sin repetir codigo 
//            while ((oneByte = in.read()) != -1) {
//                out = new FileOutputStream(sourceFilePath + (typeOfCif.equals("-c")?".cif":".des"));
//                if (typeOfCif.equals("-c")) {
//                    out.write(oneByte + numCesar[0]); 
//                } else {
//                    out.write(oneByte - numCesar[0]);
//                }
//            }
            //Dependiendo del parametro que recibe lo cifrara o lo descifrara
            if (typeOfCif.equals("-c")) {
                out = new FileOutputStream(sourceFilePath + ".cif");
                while ((oneByte = in.read()) != -1) {    
                    out.write(oneByte + numCesar);
                }
                System.out.println("Archivo cifrado");
            } else if (typeOfCif.equals("-d")) {
                out = new FileOutputStream(sourceFilePath + ".des");
                while ((oneByte = in.read()) != -1) {
                    out.write(oneByte - numCesar);
                }
                System.out.println("Archivo descifrado");
            }
        } finally {
            // En calquera caso, producirase ou non unha excepción, pechamos os
            // streams se están abertos
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        MainApp main = new MainApp();
        //El main funciona en base a los parametros del args 
        if (args.length > 0 && args[0].equals("-c")) {
            main.toolCifCesar(args[0], args[1]);
        } else if (args.length > 0 && args[0].equals("-d")) {
            main.toolCifCesar(args[0], args[1]);
        }
    }

}
