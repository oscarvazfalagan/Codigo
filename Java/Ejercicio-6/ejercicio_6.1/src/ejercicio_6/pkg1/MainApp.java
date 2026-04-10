/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6.pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Connection c = DriverManager.getConnection("jdbc:mariadb://localhost:33006/peliculas", "admin", "daw2pass")) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Conexion realizada con exito");
            System.out.println("");

            System.out.println("------------------------");
            System.out.println("MENU : ");
            System.out.println("OPCION 1 : Insertar unha nova película - ");
            System.out.println("OPCION 2 : Mostrar todas as películas - ");
            System.out.println("OPCION 3 : Buscar unha película - ");
            System.out.println("OPCION 4 : Pechar a aplicación - ");
            System.out.println("------------------------");
            System.out.println("SELECIONA UNHA OPCION : ");
            int selector;
            selector = scan.nextInt();
            System.out.println("");
            
            
            
            switch (selector) {
                case 1 -> {
                    System.out.println("Dime el titulo de la pelicula que quieres agregar : ");
                    String title = scan.nextLine();
                    System.out.println("");
                    System.out.println("Dime el año que salio la peli :");
                    int year = scan.nextInt();
                    String sql = ("INSERT INTO films (title,year) VALUES(?,?)");
                    try (PreparedStatement pst = c.prepareStatement(sql)) {
                        pst.setString(1, title);
                        pst.setInt(2, year);
                        pst.executeUpdate();
                        pst.close();
                    }
                }
                case 2 -> {
                }
                case 3 -> {
                }
                default -> {
                }
            }

        } catch (SQLException e) {
            System.out.println("A conexión co servidor de bases de datos non se puido establecer");
        }
    }

}
