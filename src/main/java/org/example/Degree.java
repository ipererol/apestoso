package org.example;

import java.util.ArrayList;
import java.util.List;

public class Degree {

    public String nameDegree;
    ArrayList<Person> listSubject = new ArrayList<>();

    Degree(String nameDegree, ArrayList<Person> listSubject) {
        this.nameDegree = nameDegree;
        this.listSubject = listSubject;
    }

    
    public void addSubject(Person as) throws Exception {
                       
        if (listSubject.size() >= 5) {

        throw new Exception("Error:Limite de asignaturas superado");
        } else {
            listSubject.add(as);
        }
        

    }
}
