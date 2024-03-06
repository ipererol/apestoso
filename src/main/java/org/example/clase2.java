package org.example;

import java.util.*;

public class clase2 {
    private String people;
    private Calendar birthdate;
    private Class2 mother;
    private Class2 father;
    private List<Class2> brother = new ArrayList<>();

    public Class2(String name, int day, int month, int year) {
        this.people = name;
        this.birthdate = Calendar.getInstance();
        this.birthdate.set(year, day, month);
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public void setProgenitor1(clase2 progenitor1) {
        this.progenitor1 = progenitor1;
    }

    public void addBro(clase2 bro) {
        // bro...
        this.bro.add(bro);
        bro.getBro().add(this);
    }

    public void setProgenitor2(clase2 progenitor2) {
        this.progenitor2 = progenitor2;
    }

    public List<clase2> getBro() {
        return bro;
    }

    public boolean familiaNumerosa() {
        return bro.size() > 2;
    }

    public boolean get_Exposito() {
        if(progenitor1 == null && progenitor2 == null) {
            return true;
        } else
            return false;
    }
}
