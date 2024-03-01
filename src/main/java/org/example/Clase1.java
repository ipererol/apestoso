package codeclean;

import java.util.ArrayList;
import java.util.List;

public class Clase1 {
    public String nombreClase;
    public int numeroPlazas = 5;
    clase2[] asignatura = new clase2[numeroPlazas];

    Clase1(String n) {
        nombreClase = n;
    }

    // añade asignatura si pasan cosas...
    public void aniadirAsignaturra(clase2 as) throws Exception {
        if (asignatura[0] != null) {
            if (asignatura[1] != null) {
                if (asignatura[2] != null) {
                    if (asignatura[3] != null) {
                        if (asignatura[4] != null) {
                              throw new Exception("a");
                        } else {
                            asignatura[4] = as;
                        }
                    } else {
                        asignatura[3] = as;
                    }
                } else {
                    asignatura[2] = as;
                }
            } else {
                asignatura[1] = as;
            }
        } else {
            asignatura[0] = as;
        }
    }
}
