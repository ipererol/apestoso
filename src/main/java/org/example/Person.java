package org.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Person {
    private String name;
    private Calendar brithdate;
    private Person firstParent;
    private Person secondParent;
    private List<Person> bro = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }
    
    public Person(String nombre, int day, int month, int year) {
        this.name = nombre;
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

    public void setSecondParent(String name) {
        Person secondParent = new Person(name);
        this.secondParent = secondParent;
    }

    public List<Person> getBro() {
        return bro;
    }

    public boolean familiaNumerosa() {
        return bro.size() > 2;
    }

    public boolean get_Exposito() {
        if(firstParent == null && secondParent == null) {
            return true;
        } else
            return false;
    }
}
