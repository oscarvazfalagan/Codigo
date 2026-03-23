/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

/**
 * Esta clase implementa unha carta de texto, estendendo a clase Card.
 * @author daw1al13
 */
public class TextCard extends Card {
    private String words;
    public TextCard(String text) {
        super(text);
    }

    @Override
    public boolean isEquals(Card card) {
        boolean isequals= false;
        if(card.getText().equals(text)){
            isequals= true;
        }
        return isequals;
    }
    
}
