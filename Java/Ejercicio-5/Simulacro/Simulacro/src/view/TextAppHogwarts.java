/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.lang.reflect.Array;

import controller.HogwartsController;
import java.util.ArrayList;
import java.util.Scanner;
import model.HogwartsCharacter;
import model.Subject;

/**
 *
 * @author daw1al13
 */
public class TextAppHogwarts implements HogwartsView {

    HogwartsController controller;
    ArrayList<HogwartsCharacter> characters;

    @Override
    public void setCharacters(ArrayList<HogwartsCharacter> characters) {
        this.characters=characters;
    }

    public TextAppHogwarts(HogwartsController controller) {
        this.controller = controller;
        
    }

    @Override
    public void setSubjects(ArrayList<Subject> subjects) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void showMenu() {
        int optionMenu = 0;
        boolean exit = false;
        while (exit != true) {
            System.out.println("Menu : ");
            System.out.println("Opcion 1 :");
            System.out.println("Opcion 2 :");
            System.out.println("Opcion 3 :");
            System.out.println("Opcion 4 :");
            System.out.println("Opcion 5 :");
            Scanner scan = new Scanner(System.in);
            System.out.println("Seleciona tu opcion : ");
            optionMenu = scan.nextInt();
            if (optionMenu == 1) {
                for (int i = 0; i < characters.size(); i++) {
                    characters.get(i).getCodigoHowarts();
                    characters.get(i).getNome();
                    characters.get(i).getCasa();
                    characters.get(i).getCaracteristicas();
                    characters.get(i).getMascota();
                }
            }else if(optionMenu == 2){
                System.out.println("Dime el codigo de un personje :");
                String charactetcode=scan.nextLine();
                controller.showCharacterData(charactetcode);
            }else if(optionMenu==4){
                System.out.println("Dime el codigo de la materia:");
                String materiacode=scan.nextLine();
                controller.showsubjectData(materiacode);
            }else if(optionMenu==5){
                exit=true;
            }else{
                System.out.println("Opcion incorrecta");
            }
        }

    }



    public ArrayList<HogwartsCharacter> getCharacters2() {
        return characters;
    }


    @Override
    public void showCharacterData(HogwartsCharacter character) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void showSubjectData(Subject subject) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void showUnderConstructionMessage(String operationName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
