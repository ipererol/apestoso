package org.example;

import java.util.ArrayList;
import java.util.List;

public class Degree {

    public String nameDegree;
    ArrayList<Subject> listSubject = new ArrayList<>();

    Degree(String nameDegree, Subject subject) {
        this.nameDegree = nameDegree;
        this.listSubject.add(subject);
    }
    
    public void addSubject(Subject subject) throws Exception {
                       
        if (listSubject.size() >= 5) {

        throw new Exception("Error:Limite de asignaturas superado");
        } else {
            listSubject.add(subject);
        }
        

    }
}
