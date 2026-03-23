/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

/**
 * Esta clase implementa unha carta matemática, estendendo a clase Card
 *
 * @author daw1al13
 */

public class MathCard extends Card {

    private int operator1;
    private int operator2;
    private char operation;

    public MathCard(String textoValeiro, int operator1, int operator2, char operation, String text, int cardType) {
        super(text);
        this.operator1 = operator1;
        this.operator2 = operator2;
        this.operation = operation;
        if(cardType==0){
            text = Integer.toString(getValue());
        }if(cardType==1){
            text = (Integer.toString(operator1)+operation+Integer.toString(operator2));
        }
       
        
    }
    private final static int MODEOPERATION = 0;
    private final static int MODERESULT = 1;
    public final static char SUM = '+' ;
    public final static char SUB = '-';
    public final static char MULT = '*';
    
    private int getValue() {
        int res = 0;
        if (operation == SUB) {
            res = operator1 + operator2;
        } else if (operation == SUB) {
            res = operator1 - operator2;
        } else {
            res = operator1 * operator2;
        }

        return res;
    }
    @Override
    public boolean isEquals(Card card) {
        boolean equal = false;
       if(card instanceof MathCard){
           equal= true;
       }
       return equal;
    }

}
