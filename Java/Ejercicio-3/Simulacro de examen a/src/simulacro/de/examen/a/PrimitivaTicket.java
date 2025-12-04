/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacro.de.examen.a;

/**
 *
 * @author daw1al13
 */
public class PrimitivaTicket {
    //Atributos 
    private int[]numbers = new int[6];//Numeros del ticket
    private int refundNumber; //Numero complementario

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getRefundNumber() {
        return refundNumber;
    }

    public void setRefundNumber(int refundNumber) {
        this.refundNumber = refundNumber;
    }
    /**
     * Constructor que crea un ticket con sus stributos
     * @param refundNumber
     * @param numbers 
     */
    public PrimitivaTicket(int refundNumber,int[] numbers) {
        this.refundNumber = refundNumber;
        this.numbers = numbers;
    }
    
}
