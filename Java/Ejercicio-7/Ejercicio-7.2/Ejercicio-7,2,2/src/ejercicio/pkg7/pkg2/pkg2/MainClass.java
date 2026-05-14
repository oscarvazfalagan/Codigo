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
import java.nio.channels.FileLock;

/**
 * Clase main que pide un fichero y lo muestra por pantalla con su ruta absoluta
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
        File file = new File(dirName, fileName);
        
        //Si el fichero no existe trata de crearlo
        // si no puede crearlo entonces muestra el porque
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("Fichero creado "+file.getName());
            } catch (IOException e) {
                System.out.println("");
                System.out.println("El directorio que has puesto no existo por lo tanto no se puede crear el fichero ni leerlo");
            }
        } else {
            System.out.println("Nombre Fichero : " + file.getName());
            System.out.println("Nombre directorio : " + file.getParent());
            System.out.println("Ruta Absoluta : " + file.getAbsolutePath());
            main.countLetter(file.getAbsolutePath());
        }
    }
    /**
     * Le pasas la ruta del fichero y obtiene el numero de A que tiene escritas en el fichero 
     * @param sourceFilePath
     * @throws IOException 
     */
    public void countLetter(String sourceFilePath)
            throws IOException {
        try (Scanner in = new Scanner(new BufferedReader(new FileReader(sourceFilePath)))) {
            int contador = 0;
            in.useDelimiter("");
            // Lemos todos os tokens del documento y contamos las a
            while (in.hasNext()) {
                if (in.next().equals("a")) {
                    contador++;
                }
            }
            System.out.println("Numero total de a = " + contador);
        }
    }

}
