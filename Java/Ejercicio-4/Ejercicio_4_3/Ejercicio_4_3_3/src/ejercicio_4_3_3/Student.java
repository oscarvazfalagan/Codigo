/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_3;

/**
 *
 * @author daw1al13
 */
public class Student extends Person implements Speaker {
    //Atributos privados de la clase Student
    private String career;
    private int course;
    /**
     * 
     * @param career
     * @param course
     * @param name
     * @param age 
     */
    public Student(String career, int course, String name, int age) {
        super(name, age);
        this.career = career;
        this.course = course;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    
    /**
     * Metodo sobre escrito que expresa los valores de un estudiante
     */
    @Override
    public void speak() {
        System.out.println("Ola, son un Estudiante e sei falar.");
        System.out.print("Nombre : " + this.name);
        System.out.println("  Carrera : " + this.career);
        System.out.print("Edad : " + this.age);
        System.out.println("  Curso : " + this.course);
        System.out.println("");

    }

}
