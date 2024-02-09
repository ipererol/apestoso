package org.example;

import java.util.ArrayList;
import java.util.List;

public class Clase1 {
    public String nombre_Clase;
    public int nPLAZAS = 5;
    clase2[] asignaturra = new clase2[nPLAZAS];

    Clase1(String n) {
        nombre_Clase = n;
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
