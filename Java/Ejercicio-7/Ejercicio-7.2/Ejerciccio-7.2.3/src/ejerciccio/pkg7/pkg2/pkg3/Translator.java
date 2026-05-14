/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciccio.pkg7.pkg2.pkg3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;

/**
 *
 * @author daw1al13
 */
import java.io.IOException;
import java.util.Properties;

/**
 * Clase translator se supone que es un traductor 
 * pero solo funciona con las palabras que estan en la lista
 * @author daw1al13
 */
public class Translator {
    
    /**
     *  Metodo main que coje dos archivos uno de propiedades y otro de palabras 
     *  y saca una traducion
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {

        InputStream input = Translator.class.getClassLoader().getResourceAsStream("dictionary.properties");
        String texto = "";
        if (input == null) {
            System.out.println("Non se pode ler o ficheiro de propiedades");
        } else {
            // Cargamos as propiedades do ficheiro
            Properties prop = new Properties();
            prop.load(input);
            try (BufferedReader in = new BufferedReader(new FileReader("palabras.txt"))) {
                String line = "";
                while ((line = in.readLine()) != null) {
                    // recorremos cada palabra individualmente 
                    // el line split lo que hace es que cuando hay un
                    // espacio establece eso como limitador y cuenta como
                    // otra linea entonces cada linea equivale a cada palabra
                    // y asi se crea el array de words
                    
                    String[] words = line.split("\\ ");

                    for (int i = 0; i < words.length; i++) {
                        if(prop.getProperty(words[i]) == null){
                            texto += words[i]+" ";
                        }else{
                            texto += prop.getProperty(words[i])+" ";
                        }
                    }
                }

            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("resultado.txt"))) {
                writer.write(texto);
                System.out.println("Documento creado correctamente");
            }catch(IOException e){
                System.out.println("Algo fallo al crear el documento");
            }
            // Obtemos o valor de dúas propiedades e pechamos o fluxo
            input.close();
        }
    }

}
