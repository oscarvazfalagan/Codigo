/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3_4_1;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class SortedArray {

    Scanner scan = new Scanner(System.in);
    private int numbers[] = new int[6];
    private boolean sorted = false;

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    private void sort() {
        boolean swapped = true;
        for (int i = numbers.length - 1; i > 0 && swapped; i--) {
            swapped = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }
        }
        this.sorted = true;
    }

    public boolean isSorted() {
        return sorted;
    }

    private void obtainNumbers() {
        System.out.println("Introduze los numeros del array de manera desordenada");
        System.out.println("-------------------------");
        for (int i = 0; i < this.numbers.length; i++) {
            System.out.println("Dime el numero " + (i + 1) + " :");
            this.numbers[i] = scan.nextInt();
        }
    }

    public SortedArray() {
        obtainNumbers();
    }

    private void show() {
        for (int number : numbers) {
            System.out.print(number);
        }
        System.out.println();
    }

    private boolean contains(int number) {
        boolean contains = false;
        for (int i = 0; i < this.numbers.length; i++) {
            if (this.numbers[i] == number) {
                contains = true;
            }
        }
        return contains;
    }

    public static void main(String[] args) {
        SortedArray array = new SortedArray();
        System.out.println("Numeros sin ordenar :");
        array.show();
        array.sort();
        System.out.println("Numeros ordenados :");
        array.show();

    }
}
