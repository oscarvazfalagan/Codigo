/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6.pkg4;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;

/**
 * Clase que maneja una base de datos de mariaDB
 *
 * @author oscar
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Intentamos la conexion con la base de datos
        try (Connection c = DriverManager.getConnection("jdbc:sqlite:peliculas.db")) {
            String createTable = """
                                 CREATE TABLE IF NOT EXISTS films (
                                     id INTEGER PRIMARY KEY AUTOINCREMENT,
                                     title TEXT NOT NULL,
                                     year INTEGER NOT NULL
                                 );
                                 """;
            Statement stT = c.createStatement();
            stT.executeUpdate(createTable);


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
                //Insector de peliculas con Prepared Steatment por seguridad
                case 1 -> {
                    System.out.println("Dime el titulo de la pelicula que quieres agregar : ");
                    scan.nextLine();
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
                //Consulta para observar todas las peliculas en la base de datos
                case 2 -> {
                    String sql = "SELECT title FROM films";
                    Statement st = c.createStatement();
                    System.out.println("Peliculas :");
                    try (ResultSet rst = st.executeQuery(sql)) {
                        while (rst.next()) {
                            System.out.println(rst.getString("title"));
                        }
                    }

                }// Buscador de peliculas usa un preparet statmen para la query 
                // y luego un Result Set para ejecutarla y mostrar los resultados
                case 3 -> {
                    System.out.println("Dime el numero de la pelicula que quieres conocer");
                    int id = scan.nextInt();
                    scan.nextLine();
                    String sql = "SELECT * FROM films where id = ?";
                    try (PreparedStatement pst = c.prepareStatement(sql)) {
                        pst.setInt(1, id);
                        boolean filmsExists = false;
                        try (ResultSet rst = pst.executeQuery()) {
                            while (rst.next()) {
                                filmsExists = true;
                                System.out.println("Tu pelicula con id numero " + id + " es : " + rst.getString("title"));
                            }
                            if (filmsExists != true) {
                                System.out.println("Esta pelicula no existe");
                            }
                        }

                    }
                }
                //Metodo para cerrar la aplicacion
                default -> {
                    System.exit(0);
                }
            }
            // Exceion por si no logra acceder a la base de datos
        } catch (SQLException e) {
            System.out.println("A conexión co servidor de bases de datos non se puido establecer: " + e.getMessage());
        }
    }


}

