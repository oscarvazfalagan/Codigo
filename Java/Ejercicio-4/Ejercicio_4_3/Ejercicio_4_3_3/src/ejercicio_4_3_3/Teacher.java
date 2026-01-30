/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_3;

/**
 *
 * @author daw1al13
 */
public class Teacher extends Person implements Speaker{

    private String office;
    private String email;

    public Teacher(String office, String email, String name, int age) {
        super(name, age);
        this.office = office;
        this.email = email;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void speak() {
        System.out.println("Ola, son un Profesor e sei falar.");
        System.out.print("Nombre : " + this.name);
        System.out.println("  Oficio : " + this.office);
        System.out.print("Edad : " + this.age);
        System.out.println("  Email : " + this.email);
        System.out.println("");
    }

}
