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

    // aniade asignatura si pasan cosas...
    public void aniadirAsignaturra(Person as) throws Exception {
        if (listSubject.size() == 5) {
//aniadir excepcion si la lista de asignaturas es mayor que 5
        } else {
            listSubject.add(as);
        }

    }
}
