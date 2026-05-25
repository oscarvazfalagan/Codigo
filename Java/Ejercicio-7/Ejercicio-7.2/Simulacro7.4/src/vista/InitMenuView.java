/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.InitMenuController;
import java.util.Scanner;

/**
 *
 * @author daw1al13
 */
public class InitMenuView {

    InitMenuController myController;

    public InitMenuView(InitMenuController myController) {
        this.myController = myController;
    }

    public void showInvalidUser() {
        System.out.println("Las credenciales introducidas son incorrectas");
    }

    public boolean showloginMenu() {
        String user;
        String password;
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu INICIAL : ");
        System.out.println("");
        System.out.println("Introduce tu nombre de usuario (Presiona la tecla ENTER sin introducir nada para salir)");
        user = scan.nextLine();
        if (user.isEmpty()) {
            return true;
        } else {
            System.out.println("Dime la contraseña : ");
            password = new String(System.console().readPassword());
        }
        myController.login(user, password);
        return false;
    }
;
}
