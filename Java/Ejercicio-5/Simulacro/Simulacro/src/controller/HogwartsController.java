/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Pet;
import model.Student;
import model.Subject;
import model.Teacher;
import persistencia.HogwartsCharacterDB;
import persistencia.SubjectDB;
import view.HogwartsView;
import view.TextAppHogwarts;

/**
 *
 * @author daw1al13
 */
public class HogwartsController {
    private TextAppHogwarts view;

    public HogwartsController() {
        view = new TextAppHogwarts(this);
        view.showMenu();
    }
    
    public void initApp(){
        view.setCharacters(HogwartsCharacterDB.getHogwartsCharacters());
    }
    public void showCharacterData(String hogwartsCode){
        view.showCharacterData(HogwartsCharacterDB.findByCode(hogwartsCode));
    }
    public void showsubjectData(String subjectCode){
        view.showSubjectData(SubjectDB.findByCode(subjectCode));
    }
    public void loadSampleData(){
        Student harry = new Student("Harry Potter", "Cicatriz en forma de raio na fronte","A-1992-0001", "Griffindor", new Pet("Curuxa", "Hedwig", 3), "Buscador", 3);
        Student hermione = new Student("Hermione Granger", "Moi observadora e boa estudante",
                "A-1992-0002", "Griffindor", new Pet("Gata", "Crookshanks", 2), "", 3);
        Student draco = new Student("Draco Malfoy", "Inimigo de Harry Potter",
                "A-1992-0004", "Slytherin", null, "Buscador", 3);
        Teacher dumbledore = new Teacher("Albus Dumbledore", "Longa barba", "P-001",
                "", new Pet("Fénix", "Fawkes", 150), "500 anos de experiencia na maxia");
        Teacher minerva = new Teacher("Minerva McGonagall",
                "Moi estrita", "P-002", "Griffindor", null, "Experta en feitizos");
        Teacher snape = new Teacher("Severus Snape", "Apariencia escura", "P-003",
                "Slytherin", null, "Experto en maxia negra");

        Subject trans4 = new Subject("MM-401", "Transformacións 4", 4, minerva);
        trans4.getStudents().add(harry);
        trans4.getStudents().add(hermione);
        trans4.getStudents().add(draco);
        Subject pot4 = new Subject("MM-402", "Pocións 4", 4, snape);

        HogwartsCharacterDB.getHogwartsCharacters().add(harry);
        HogwartsCharacterDB.getHogwartsCharacters().add(hermione);
        HogwartsCharacterDB.getHogwartsCharacters().add(draco);
        HogwartsCharacterDB.getHogwartsCharacters().add(dumbledore);
        HogwartsCharacterDB.getHogwartsCharacters().add(minerva);
        HogwartsCharacterDB.getHogwartsCharacters().add(snape);

        SubjectDB.getSubjects().add(trans4);
        SubjectDB.getSubjects().add(pot4);
    }
    
    public static void main(String[] args) {
        HogwartsController controller = new HogwartsController();
        controller.loadSampleData();
        controller.initApp();
    }
}
