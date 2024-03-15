package org.example;

import java.util.ArrayList;
import java.util.Calendar;

public class Class2 {
    private String name;
    private Calendar birthdate;
    private Class2 parent1;
    private Class2 parent2;
    private ArrayList<Class2> brother = new ArrayList<>();

    public Class2(String name, int day, int month, int year) {
        this.name = name;
        this.birthdate.set(year, day, month);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class2 getParent1() {
        return parent1;
    }

    public void setParent1(Class2 parent1) {
        this.parent1 = parent1;
    }

    public Calendar getBirhdate(){
	return birthdate;
    }

    public void setBirthdate(Calendar birthdate){
    	this.birthdate = birthdate;
    }

    public Class2 getParent2() {
        return parent2;
    }

    public void setParent2(Class2 parent2) {
        this.parent2 = parent2;
    }

    public ArrayList<Class2> getBrother() {
        return brother;
    }

    public void setBrother(ArrayList<Class2> brother) {
        this.brother = brother;
    }

    public void addBrother(Class2 brother) {
        this.brother.add(brother);
        brother.getBrother().add(this);
    }

    public boolean isLargeFamily() {
        return brother.size() > 2;
    }
    
    public boolean isOrphan() {
        return (parent1 == null && parent2 == null);
    }
}
