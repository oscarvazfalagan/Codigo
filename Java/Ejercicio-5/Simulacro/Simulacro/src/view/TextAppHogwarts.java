/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Excepcions.UnderConstructionException;
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
        this.characters = characters;
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
        Scanner scan = new Scanner(System.in);
        while (exit != true) {
            System.out.println("Benvido a Hogwarts... : ");
            System.out.println("Opcion 1 : Listar todas as personaxes");
            System.out.println("Opcion 2 : Mostrar os datos dunha personaxe");
            System.out.println("Opcion 3 : Listar todas as materias");
            System.out.println("Opcion 4 : Mostrar os datos dunha materia");
            System.out.println("Opcion 5 : Saír de Hogwarts");
            System.out.println("Que queres facer? : ");
            optionMenu = scan.nextInt();
            scan.nextLine();
            if (optionMenu == 1) {
                for (int i = 0; i < characters.size(); i++) {
                    System.out.println("Personaxe " + (i + 1) + " : ");
                    System.out.println(characters.get(i).getCodigoHowarts());
                    System.out.println(characters.get(i).getNome());
                    System.out.println(characters.get(i).getCasa());
                    System.out.println(characters.get(i).getCaracteristicas());
                    System.out.println("");
                }
            } else if (optionMenu == 2) {
                System.out.println("Dime el codigo de un personje :");
                String charactetcode = scan.nextLine();
                controller.showCharacterData(charactetcode);
            } else if (optionMenu == 4) {
                System.out.println("Dime el codigo de la materia:");
                String materiacode = scan.nextLine();
                controller.showsubjectData(materiacode);
            } else if (optionMenu == 5) {
                exit = true;
            } else {
                System.out.println("Opcion incorrecta");
            }
        }

    }

    public ArrayList<HogwartsCharacter> getCharacters2() {
        return characters;
    }

    @Override
    public void showCharacterData(HogwartsCharacter character) throws UnderConstructionException {
        throw new UnderConstructionException();
    }

    @Override
    public void showSubjectData(Subject subject) throws UnderConstructionException {
        throw new UnderConstructionException();
    }

    @Override
    public void showUnderConstructionMessage(String operationName) {
        System.out.println(" A operación "+ operationName +"aínda está en construcción");
    }

}
