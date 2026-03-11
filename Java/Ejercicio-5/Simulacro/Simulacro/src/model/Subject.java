/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author daw1al13
 */
public class Subject {
    private String codigoMateria;
    private String nome;
    private int curso;
    private Teacher profe;
    private ArrayList<Student> students = new ArrayList<>();

    public Subject(String codigoMateria, String nome, int curso, Teacher profe) {
        this.codigoMateria = codigoMateria;
        this.nome = nome;
        this.curso = curso;
        this.profe = profe;
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public Teacher getProfe() {
        return profe;
    }

    public void setProfe(Teacher profe) {
        this.profe = profe;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> estudiantes) {
        this.students = estudiantes;
    }
}
