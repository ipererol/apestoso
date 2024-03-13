package org.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Person {

    private String name;
    private Calendar birthdate;
    private Person firstParent;
    private Person secondParent;
    private List<Person> brothers = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthdate = Calendar.getInstance();
        this.birthdate.set(year, day, month);
    }

    public void setFirstParent(String name) {
        Person firstParent = new Person(name);
        this.firstParent = firstParent;
    }

    public void addBrother(String name) {
        Person brother = new Person(name);
        this.brothers.add(brother);
        if (!brothers.contains(this))  {
            this.brothers.add(this);
        }
    }

    public void setSecondParent(String name) {
        Person secondParent = new Person(name);
        this.secondParent = secondParent;
    }

    public List<Person> getBrothers() {
        return brothers;
    }

    public boolean largeFamily() {
        return brothers.size() > 2;
    }

    public boolean get_Exposito() {
        if (firstParent == null && secondParent == null) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        Calendar now = Calendar.getInstance();
        int age = now.get(Calendar.YEAR) - this.birthdate.get(Calendar.YEAR);
        if (now.get(Calendar.MONTH) < this.birthdate.get(Calendar.MONTH)) {
            age--;
        }
        return age;
    }
}
