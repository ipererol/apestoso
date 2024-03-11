package org.example;

import java.util.ArrayList;
import java.util.List;

public class Clase1 {

    public String nameDegree;
    ArrayList<clase2> listSubject = new ArrayList<>();

    Clase1(String nameDegree, ArrayList<clase2> listSubject) {
        this.nameDegree = nameDegree;
        this.listSubject = listSubject;
    }

    // aniade asignatura si pasan cosas...
    public void aniadirAsignaturra(clase2 as) throws Exception {
        if (listSubject.size() == 5) {
//aniadir excepcion si la lista de asignaturas es mayor que 5
        } else {
            listSubject.add(as);
        }

    }
}
