/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7.pkg1.pkg1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 *  Clase main que para substituir el segundo argument del archivo por el tercero y crear una copia
 * @author daw1al13
 */
public class MainApp {
    /**
     * El metodo obtiene los parametros el archivo ademas del caracter que quieres substituir por el
     * que quieres ser substituido
     * 
     * 
     * @param sourceFilePath
     * @throws IOException 
     */
    public void changeCharacter(String sourceFilePath,String letter,String letterSub)throws IOException {
        try (InputStream in = new FileInputStream(sourceFilePath); 
                OutputStream out = new FileOutputStream(sourceFilePath+".copia")) {
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                //Leemos el oneByte y si este coincide con el char entonces lo substituye
                if((char)oneByte == letter.charAt(0)){
                    oneByte = letterSub.charAt(0);
                }
                out.write(oneByte);
            }
            System.out.println("Completado");
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
        main.changeCharacter(args[0], args[1],args[2]);
        
    }

}
