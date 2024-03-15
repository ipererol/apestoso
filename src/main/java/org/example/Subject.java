package org.example;

import java.util.ArrayList;
import java.util.List;
import org.example.clase2;

public class Subject {
    private float subjectName;
    private ArrayList<clase2> people;
    private final int MAX_ALUMNOS;
    
    public Subject(float SubjectName, ArrayList<clase2> people, int MAX_ALUMNOS){
        this.subjectName = SubjectName;
        this.people = people;
        this.MAX_ALUMNOS = MAX_ALUMNOS;
    }
    
    public float getSubjectName(){
        return subjectName;
    }

    public void setSubjectName(float subjectName){
        this.subjectName = subjectName;
    }

    public ArrayList<clase2> getPeople(){
        return people;
    }

    public void setPeople(ArrayList<clase2> people){
        this.people = people;
    }

    public int getMAX_ALUMNOS(){
        return MAX_ALUMNOS;  
    }
    public void addStudent(clase2 Student)  throws Exception {
       
        if (people.size() < MAX_ALUMNOS) {
            people.add(Student);

        } else {
            throw new Exception("Ha superado el maximo de alumnos");  
            
        }
    }

    public void listStudents() {
        for (clase2 student : people) {
            System.out.println(student);
        }
    }


}

