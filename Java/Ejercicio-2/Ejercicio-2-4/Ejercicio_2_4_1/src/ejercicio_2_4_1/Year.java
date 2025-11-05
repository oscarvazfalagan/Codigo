/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2_4_1;

/**
 *
 * @author daw1al13
 */
public class Year {

    private boolean leapYear;
    public Year(boolean leapYear) {
        this.leapYear = leapYear;
    }

    public boolean isLeapYear() {
        return leapYear;
    }

    public void setLeapYear(boolean leapYear) {
        this.leapYear = leapYear;
    }



    public void showDaysMethod(int mes,boolean leapYear){
        
        
        if (leapYear == true){
            switch (mes){
                case 1,3,5,7,8,10,12 -> System.out.println("Tu mes tiene 31 dias");
                case 4,6,9,11 -> System.out.println("Tu mes tiene 30 dias");
                case 2 ->System.out.println("Tu mes tiene 29 dias");  
            }
        }
        if (leapYear == false){
            switch (mes){
                case 1,3,5,7,8,10,12 -> System.out.println("Tu mes tiene 31 dias");
                case 4,6,9,11 -> System.out.println("Tu mes tiene 30 dias");
                case 2 ->System.out.println("Tu mes tiene 28 dias");  
            }
        }
    }   
}
