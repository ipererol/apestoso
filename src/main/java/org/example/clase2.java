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

    public Class2 getMother() {
        return mother;
    }

    public void setMother(Class2 mother) {
        this.mother = mother;
    }

    public Calendar getBirhdate(){
	return birthdate;
    }

    public void setBirthdate(Calendar birthdate){
    	this.birthdate = birthdate;
    }

    public Class2 getFather() {
        return father;
    }

    public void setFather(Class2 father) {
        this.father = father;
    }

    public List<Class2> getBrother() {
        return brother;
    }

    public void setBrother(List<Class2> brother) {
        this.brother = brother;
    }

    public void addBrother(Class2 brother) {
        this.brother.add(brother);
        brother.getBrother().add(this);
    }

    public boolean getLargeFamily() {
        return brother.size() > 2;
    }
    
    public boolean getOrphan() {
        if (mother == null && father == null) {
            return true;
        } else {
            return false;
        }
    }
}
