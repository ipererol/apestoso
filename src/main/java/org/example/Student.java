package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends Person {

    private LocalDate birthdate;
    private Person legalTutor1;
    private Person legalTutor2;
    private ArrayList<Person> siblings;

    public Student(String birthdate, String legalTutor1, String legalTutor2, ArrayList<Person> siblings, String name) {
        super(name);
        this.birthdate = LocalDate.parse(birthdate);
        if (!legalTutor2.equalsIgnoreCase("null")) {
           this.legalTutor2 = new Person(legalTutor1); 
        }
        if (!legalTutor1.equalsIgnoreCase("null")) {
           this.legalTutor1 = new Person(legalTutor1); 
        }     
           this.siblings = siblings;
    }

    public Student(String birthdate, String legalTutor1, String legalTutor2, String name) {
        super(name);
        this.birthdate = LocalDate.parse(birthdate);  if (!legalTutor2.equalsIgnoreCase("null")) {
           this.legalTutor2 = new Person(legalTutor1); 
        }
        if (!legalTutor1.equalsIgnoreCase("null")) {
           this.legalTutor1 = new Person(legalTutor1); 
        }
    }
    public Student(String birthdate, String name) {
        super(name);
        this.birthdate = LocalDate.parse(birthdate);
     

    }

    @Override
    public String toString() {
        return "Estudiante{" +super.toString()+ "FechaNacimiento=" + birthdate + ", Tutor legal 1=" + legalTutor1 + ",Tutor legal 2=" + legalTutor2 + ", siblings=" + siblings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getLegalTutor1() {
        return legalTutor1;
    }

    public void setLegalTutor1(Student legalTutor1) {
        this.legalTutor1 = legalTutor1;
    }

    public LocalDate getBirhdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Person getLegalTutor2() {
        return legalTutor2;
    }

    public void setLegalTutor2(Student legalTutor2) {
        this.legalTutor2 = legalTutor2;
    }

    public ArrayList<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(ArrayList<Person> siblings) {
        this.siblings = siblings;
    }

    public boolean isLargeFamily() {
        if (siblings == null) return false;
         else return siblings.size() > 2;
        
    }

    public boolean isTutored() {
        return legalTutor1 != null || legalTutor2 != null;
    }
}
