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
        if(asignaturra[0] != null)
            if(asignaturra[1] != null)
                if(asignaturra[2] != null)
                    if(asignaturra[3] != null)
                        if(asignaturra[4]!=null)
                            throw new Exception("a");
        else
            asignaturra[4] = as;
        else
            asignaturra[3] = as;
        else
            asignaturra[2] = as;
        else asignaturra[1] = as;
        else asignaturra[0] = as;

    }
}
