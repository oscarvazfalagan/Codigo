/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacro.de.examen.a;

import java.util.Scanner;

/**
 * Metodo Primitiva para crear una primitiva y establecer los premiados
 *
 * @author daw1al13
 */
public class Primitiva {

    //Atributos estaticos para establecer los valores maxmios
    public final static int TOTAL_NUMBERS = 6;
    public final static int MAX_NUMBER = 49;
    public final static int MAX_REFUND_NUMBER = 9;
    //Atributos que obtienen la fecha como day,month,year
    private int day;
    private int month;
    private int year;
    //Atributos que establecen Numeros premiados
    private int winnerNumber[] = new int[TOTAL_NUMBERS];
    private int winnerComplement;
    private int refundNumber;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int[] getWinnerNumber() {
        return winnerNumber;
    }

    public void setWinnerNumber(int[] winnerNumber) {
        this.winnerNumber = winnerNumber;
    }

    public int getWinnerComplement() {
        return winnerComplement;
    }

    public void setWinnerComplement(int winnerComplement) {
        this.winnerComplement = winnerComplement;
    }

    public int getRefundNumber() {
        return refundNumber;
    }

    public void setRefundNumber(int refundNumber) {
        this.refundNumber = refundNumber;
    }

    /**
     * Constructor de la clase Primitiva que le da valor a day,month,year
     *
     * @param day
     * @param month
     * @param year
     */
    public Primitiva(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Metodo show result muestra por pantallla los numeros premiados
     */
    public void showResult() {
        System.out.println("O resultado do sorteo realizado o 21 do 11 do 2019 foi o seguinte :");
        //Recorres un bucle para mostrar los numeros del array
        //usas print para no saltar de linea
        System.out.print("Numeros premiados : ");
        for (int i = 0; i < winnerNumber.length; i++) {
            System.out.print(winnerNumber[i] + " ");
        }
        //Saltas de linea porque termina el bucle
        System.out.println("");
        System.out.println("Complementario : " + winnerComplement);
        System.out.println("Reintegro : " + refundNumber);
    }

    /**
     * Metodo para establecerle los valores de los diferentes premios
     */
    public void makeDraw() {
        int value; // Inicializamos la variable value para guardar el numero aleatorio
        //Valor de los numeros ganadores de la matriz
        for (int i = 0; i < winnerNumber.length; i++) {
            do {
                value = (new java.util.Random().nextInt(MAX_NUMBER)) + 1; // Generamos un numero aleatorio entre 1 y MAX_NUMBER
            } while (checker(value) == true); // Comprobamos que el numero no este repetido en la matriz
            this.winnerNumber[i] = value; // Si no esta repetido lo guardamos en la matriz
        }
        //Valor de complementario
        do {
            value = (new java.util.Random().nextInt(MAX_NUMBER)) + 1; // Generamos un numero aleatorio entre 1 y MAX_NUMBER
        } while (checker(value) == true); // Comprobamos que el numero no este repetido en la matriz
        this.winnerComplement = value; // Si no esta repetido lo guardamos en el complementario

        //Valor de reintegro
        this.refundNumber = (new java.util.Random().nextInt(MAX_REFUND_NUMBER)) + 1; // Generamos un numero aleatorio entre 1 y MAX_REFUN_NUMBER

    }

    /**
     * Metodo para comprobar si un numero esta repetido
     */
    private boolean checker(int value) {
        // Variable confim para confirmar si el numero ya existe en la matriz
        boolean confirm = false;
        // Recorremos la matriz para comprobar si el numero ya existe

        for (int i = 0; i < winnerNumber.length && !confirm; i++) {
            if (value == winnerNumber[i]) {// Comparamos value con todas las posiciones de la matriz
                confirm = true; // si el numero ya existe confirm es true y se vuelve a generar otro numero
                // random
            }
        }
        // Devolvemos el valor confirm que sera false si el numero no existe en la
        // matriz y true si ya existe
        // haciendo que se ejecute otra vez el bucle do while
        return confirm;
    }
    /**
     * Metodo que genera un ticket de la primitiva introduciendo 6 valores y su reintegro
     * y lo crea como un objeto de la clase PrimitivaTicket
     * @return ticket
     */
    public PrimitivaTicket generateTicket() {
        Scanner scan = new Scanner(System.in);
        //Introducimos los valores del bolleto
        System.out.println("Vamos a hacer un boleto de primitiva");
        int[] numbers = new int[TOTAL_NUMBERS];
        int reintegro;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduze el numero " + (i + 1) + " :");
            numbers[i] = scan.nextInt();
        }
        System.out.println("Para finalizar introduce el reintegro : ");
        reintegro = scan.nextInt();
        //Creamos el objeto ticket
        PrimitivaTicket ticket = new PrimitivaTicket(reintegro, numbers);
        return ticket;
    }
    //Metodo que muestra lo que has ganado usando el ticket de la clase PrimitivaTicket
    public void showPrize(PrimitivaTicket ticket) {
        //Obtienes los numeros del ticket
        int[] TicketNumbers = ticket.getNumbers();
        //Una variable para saber cuantos numeros han sido premiados
        int Premied = 0;
        //Obtenemos el valor del reintegro del ticket
        int ticketReintegro = ticket.getRefundNumber();
        //Establezemos el numero complementario como falso
        boolean complementaries = false;
        //Recorremos los numeros del ticket
        for (int i = 0; i < TicketNumbers.length; i++) {
            //Si ese valor al pasar por el checker existe devuelve true por lo tanto es un premiado
            if (checker(TicketNumbers[i])) {
                Premied += 1;
            }//y si uno del ticket cuadra con el complementario lo establezemos como true
            if (winnerComplement ==TicketNumbers[i]){
                complementaries = true;
            }
        }
        
        //Desde aqui muestra por pantalla las diferentes opciones
        if (Premied == 6){ //Con 6 premiados
            System.out.println(" 6 acertos. Premio de 500000€!");
        }else if (Premied == 5 && complementaries){ //Con 5 premiados
            System.out.println("5 acertos mais o complementario. Premio de 10000€!");
        }else if (Premied == 5 ){ //5 premiados + el complementario
            System.out.println("5 acertos. Premio de 500€!");
        }else if (Premied == 4 && complementaries){ //4 mas el complementario
            System.out.println("4 acertos mais o complementario. Premio de 20€!");
        }else if (ticketReintegro == refundNumber){ // Comprueba el reintegro
            System.out.println("Reintegro do boleto!");
        }else{ //El billete no tiene premio
            System.out.println(" O billete non ten premio");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creas un objeto primitiva
        Primitiva primitiva = new Primitiva(8, 12, 2006);
        //Metodo para crear los valores de premiados en una primitiva
        primitiva.makeDraw();
        //Llamas al metodo show result para mostrar los numeros premiados
        primitiva.showResult();
        //Crea un ticket
        PrimitivaTicket ticket = primitiva.generateTicket();
        System.out.println("");
        System.out.println("Tu premio es :");
        System.out.println("-------------------------");
        //Muestra lo que ganas
        primitiva.showPrize(ticket);
    }

}
