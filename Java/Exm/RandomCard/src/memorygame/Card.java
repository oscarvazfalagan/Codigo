/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

/**
 * É unha clase abstracta que implementa o comportamento común de calquera tipo de carta
 * @author daw1al13
 */
public abstract class Card {
    protected String text;
    protected boolean hit;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isHit() {
        return hit;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }

    public Card(String text) {
        this.text = text;
    }
    public abstract boolean isEquals(Card card);
}
