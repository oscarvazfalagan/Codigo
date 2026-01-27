/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_3_3;

/**
 *
 * @author daw1al13
 */
public class Teacher extends Person {
    private String Office;
    private String Email;

    public Teacher(String Office, String Email, String Name, int Age) {
        super(Name, Age);
        this.Office = Office;
        this.Email = Email;
    }

    public String getOffice() {
        return Office;
    }

    public void setOffice(String Office) {
        this.Office = Office;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}
