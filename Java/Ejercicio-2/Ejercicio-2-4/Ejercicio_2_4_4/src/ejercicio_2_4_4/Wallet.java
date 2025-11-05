/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2_4_4;

/**
 *
 * @author daw1al13
 */
public class Wallet {
    private double money;
    private boolean card;

    public Wallet(double money, boolean card) {
        this.money = money;
        this.card = card;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public boolean isCard() {
        return card;
    }

    public void setCard(boolean card) {
        this.card = card;
    }
    public String available(){
        if (this.money > 100){
            return "Si tienes efectivo";
        }else if (this.money < 100 & this.card == true){
            return "Vete al cajero";
        }else{
            return "Vete a la sucursal";
        }
    }
}

