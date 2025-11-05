/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2_7_5;

/**
 *Clase Tarot para comprobaciones con años y el calculo del tarot
 * @author Oscar Vaz Falagan
 */
public class Tarot {

    
    /**
     * Metodo que identifica los años bisiestos
     * @param year
     * @return boolean
     */
    public boolean isLeapYear(int year){
       boolean leapYear = false;
       int division4 = year % 4;
       int division100 = year % 100;
       int division400 = year % 400;
       if (division4 == 0 && division100 != 0 || division400==0){
           return leapYear = true;
       }else{
        return leapYear;
       }
    }
    
    /**
     * Metodo que comprueba si se pueden usar los atributos
     * @param day
     * @param month
     * @param year
     * @return boolean
     */
    public boolean checkDate(int day,int month,int year){
        switch (month){
            case 1,3,5,7,8,10,12 ->{
                return day <= 31;//Si day == 31 retorna verdadero
            }

            case 4,6,9,11 ->{
                return day<=30;
            }

            case 2 ->{
                if (isLeapYear(year)&& day<=29 || day<= 28){
                    return true;
                }else{
                    System.out.println("error");
                }
            }
        }
        return false;
        
    }
    
    
    /**
     * Metodo que calcula el numero del tarot en base a los atributos
     * @param day
     * @param month
     * @param year
     * @return calculate_final
     */
    public int calculateTarot(int day,int month,int year){
        int saver=0;
        int aux=0;
        int calculate_final=15;
        while (calculate_final>10){
            
            aux=day/10;
            day=day%10;
            saver=saver+day;
            day=aux;
            
            
            aux=month/10;
            month=month%10;
            saver=saver+month;
            month=aux;
            
            
            aux=year/10;
            year=year%10;
            saver=saver+year;
            year=aux;
         
            
            if (month==0 && day==0 && year==00){
                if (saver>10){
                    aux=saver%10;
                    saver=saver/10;
                    calculate_final=saver+aux;
                }
            }
            
            
        }
        return calculate_final;
    }
}
  