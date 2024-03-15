package org.example;

import java.util.ArrayList;
import java.util.Calendar;

public class Student extends Person{
    private Calendar birthdate;
    private Person legalTutor1;
    private Person legalTutor2;
    private ArrayList<Student> brother = new ArrayList<>();

    public Student(Calendar birthdate, Person legalTutor1, Person legalTutor2, String name) {
        super(name);
        this.birthdate = birthdate;
        this.legalTutor1 = legalTutor1;
        this.legalTutor2 = legalTutor2;
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

    public Calendar getBirhdate(){
	return birthdate;
    }

    public void setBirthdate(Calendar birthdate){
    	this.birthdate = birthdate;
    }

    public Person getLegalTutor2() {
        return legalTutor2;
    }

    public void setLegalTutor2(Student legalTutor2) {
        this.legalTutor2 = legalTutor2;
    }

    public ArrayList<Student> getBrother() {
        return brother;
    }

    public void setBrother(ArrayList<Student> brother) {
        this.brother = brother;
    }

    public void addBrother(Student brother) {
        this.brother.add(brother);
        brother.getBrother().add(this);
    }

    public boolean isLargeFamily() {
        return brother.size() > 2;
    }
    
    public boolean isOrphan() {
        return (legalTutor1 == null && legalTutor2 == null);
    }
}
