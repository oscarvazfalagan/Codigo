/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

/**
 *  Esta clase implementa a interface anterior e xerará as cartas a partir duns arrays estáticos definidos no propio código
 * @author daw1al13
 */
public class ArrayCardGenerator implements CardGenerator {

    private static final String[] words = new String[]{"Elefante", "Pataca", "Pera"};
    private static final int[] operators1 = new int[]{3, 5, 6};
    private static final int[] operators2 = new int[]{9, 2, 3};
    private static final char[] operations = new char[]{MathCard.SUM, MathCard.MULT, MathCard.SUB};
    
    /**
     * Genera parejas y las introduce a su posicion del array
     * @param numFilas
     * @param numColumnas
     * @return
     * @throws GenerateCardsException
     */
    @Override
    public Card[][] generateCards(int numFilas, int numColumnas) throws GenerateCardsException {
        Card[] cardPair = new Card[1];
        Card[][] cards = new Card[numFilas][numColumnas];
        if (numFilas * numColumnas > 12) {
            throw new GenerateCardsException("Se queres tantas cartas, debes mercar a versión PRO");
        } else {
            //Se recorre el numero de filas 
            for (int i = 0; i < numColumnas * numFilas; i++) {
                if (i < ((numColumnas * numFilas)/2)/2) {
                    //Y hace parejas
                    cardPair[0] = new TextCard(words[i]);
                    cardPair[1] = new TextCard(words[i]);
                    insertPair(cardPair, cards, numFilas, numColumnas);
                } else if (i < ((numColumnas * numFilas)/2)/2) {
                    //Con math card se hace con los distintos tipos
                    cardPair[0] = new MathCard("",operators1[i], operators2[i], operations[i], "", 0);
                    cardPair[1] = new MathCard("",operators1[i], operators2[i], operations[i], "", 1);
                    insertPair(cardPair, cards, numFilas, numColumnas);
                }
            }
        }
        return cards;
    }
    

    

    

    private void insertPair(Card[] cardPair, Card[][] cards, int rows, int columns) {
        for (int i = 0; i < 2; i++) {
            boolean cardInserted = false;
            do {
                int row = new java.util.Random().nextInt(rows);
                int column = new java.util.Random().nextInt(columns);
                if (cards[row][column] == null) {
                    cards[row][column] = cardPair[i];
                    cardInserted = true;
                }
            } while (!cardInserted);
        }
    }
}
