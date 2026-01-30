/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_3;

/**
 * Clase Abstracta que genera los metodos y atributos de un pajaro
 * @author daw1al13
 */
public abstract class Bird {
    //Atributos protegidos que comparten los pajaros
    protected String sex;
    protected int age;
    
    /**
     * Obtiene el sexo del pajaro
     * @return sex
     */
    public String getSex() {
        return sex;
    }
    
    /**
     * Establece un sexo para el pajaro
     * @param sex 
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    /**
     * Obtiene la edad de un pajaro
     * @return age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Establece una edad para los pajaros
     * @param age 
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * Constructor de la clase pajaro que usa los parametros sex y age para construir un pajaro
     * @param sex
     * @param age 
     */
    public Bird(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

}