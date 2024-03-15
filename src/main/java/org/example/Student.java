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
        this.legalTutor1 = new Person(legalTutor1);
        this.legalTutor2 = new Person(legalTutor2);
        this.siblings = siblings;
    }

    public Student(String birthdate, String legalTutor1, String legalTutor2, String name) {
        super(name);
        this.birthdate = LocalDate.parse(birthdate);
        this.legalTutor1 = new Person(legalTutor1);
        this.legalTutor2 = new Person(legalTutor2);
    }

    @Override
    public String toString() {
        return "Student{" + "birthdate=" + birthdate + ", legalTutor1=" + legalTutor1 + ", legalTutor2=" + legalTutor2 + ", siblings=" + siblings + super.toString();
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
        return siblings.size() > 2;
    }

    public boolean isOrphan() {
        return (legalTutor1 == null && legalTutor2 == null);
    }
}
