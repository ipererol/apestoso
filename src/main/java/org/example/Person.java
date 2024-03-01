package org.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Person {
    private String nombre_ALUMNO;
    private Calendar brithdate;
    private Person firstParent;
    private Person progenitor2;
    private List<Person> bro = new ArrayList<>();

    public Person(String name) {
        this.nombre_ALUMNO = name;
    }
    
    public Person(String nombre, int day, int month, int year) {
        this.nombre_ALUMNO = nombre;
        this.brithdate = Calendar.getInstance();
        this.brithdate.set(year, day, month);
    }

    public void setFirstParent(String name) {
        Person firstParent = new Person(name);
        this.firstParent = firstParent;
    }

    public void addBro(Person bro) {
        // bro...
        this.bro.add(bro);
        bro.getBro().add(this);
       
    }

    public void setProgenitor2(Person progenitor2) {
        this.progenitor2 = progenitor2;
    }

    public List<Person> getBro() {
        return bro;
    }

    public boolean familiaNumerosa() {
        return bro.size() > 2;
    }

    public boolean get_Exposito() {
        if(firstParent == null && progenitor2 == null) {
            return true;
        } else
            return false;
    }
}
