/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colorcombination;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author daw1al13
 */
public class BrainBreaker {

    public final static int MAX_TRYS = 10;
    private ArrayList<ColorCombination> combinationList = new ArrayList<ColorCombination>();
    private int secretCombination[];
    private int trys;

    public int getTrys() {
        return trys;
    }

    public void setTrys(int trys) {
        this.trys = trys;
    }

    public BrainBreaker() {
        ColorCombination secret = new ColorCombination();
        secret.genereateCombination();
        this.secretCombination = secret.getCombination();
        System.out.println("Buenas la partida ha comenzado :");
        

    }

    public void showGamePhase() {
        Scanner scan = new Scanner(System.in);
        ColorCombination combination = new ColorCombination();
        int ownCombination[] = combination.getCombination();
        System.out.println("Vamos a introducir 3 colores : ");
        System.out.println("-------------------------------");
        System.out.println("Los colores tienen los siguientes valores");
        System.out.println("Rojo ------ > 0");
        System.out.println("Verde ------ > 1");
        System.out.println("Amarillo ------ > 2");
        System.out.println("Rosa ------ > 3");
        for (int i = 0; i < ownCombination.length; i++) {
            System.out.println("Introduze el color numero " + (i + 1) + " :");
            ownCombination[i] = scan.nextInt();
            combination.setCombination(ownCombination);
        }
        System.out.println(combination.getColorsAsString());
        trys++;
        System.out.println("LLevas un total de : " + trys + " intentos");
        System.out.println("En el intento " + trys + " hubo un total de : " + combination.getCommonColors(combination) + " coincidencias y un total de : " + combination.gethits(combination) + " hits");
        combinationList.add(combination);
    }

    public boolean isGameOver() {
        boolean finish = false;
        ColorCombination combination = new ColorCombination();
        for (int i = 0; i < combinationList.size(); i++) {
            combination = combinationList.get(i);
            if (combination.gethits(combination) == 3 || trys == MAX_TRYS) {
                finish = true;
            }
        }
        return finish;
    }

    public void showFinalMessage() {
        ColorCombination combination = new ColorCombination();
        boolean win = false;
        for (int i = 0; i < combinationList.size(); i++) {
            combination = combinationList.get(i);
            if (combination.gethits(combination) == 4) {
                win = true;
                System.out.println("Increible has acertado enhorabuena");
            }
        }
        if (trys == MAX_TRYS && !win) {
            System.out.println("Te quedaste sin intentos ");
            System.out.println("");
            System.out.println("GAME OVER !!!!!!!!!!");

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int restart = 1;
        do {
            Scanner scan = new Scanner(System.in);
            BrainBreaker game = new BrainBreaker();
            if (!game.isGameOver()) {
                game.showGamePhase();
            }
            game.showFinalMessage();
            System.out.println("Quieres jugar otra partida : ");
            System.out.println("No ---- >  0");
            System.out.println("Si ---- >  1");
            restart = scan.nextInt();
            }while (restart == 1);
        System.out.println("-------------------------");
        System.out.println(" ");
        System.out.println("Gracias por jugar !!!!!!");
        }

    }
