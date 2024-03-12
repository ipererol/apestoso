package org.example;

import java.util.ArrayList;
import java.util.List;

public class Degree {

    public String nameDegree;
    ArrayList<Subject> listSubject = new ArrayList<>();

    Degree(String nameDegree, ArrayList<Subject> listSubject) {
        this.nameDegree = nameDegree;
        this.listSubject = listSubject;
    }

    
    public void addSubject(Subject as) throws Exception {
                       
        if (listSubject.size() >= 5) {

        throw new Exception("Error:Limite de asignaturas superado");
        } else {
            listSubject.add(as);
        }
        

    }
}
