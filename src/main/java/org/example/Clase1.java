package codeclean;

import java.util.ArrayList;
import java.util.List;
import org.example.clase2;

public class Clase1 {

    public String nombreClase;
    public int numeroMaxAsignatura = 5;
    //numeroPlazas se tiene que llamar numeroMaxAsignatura
    clase2[] asignatura = new clase2[numeroMaxAsignatura]; // DEBERIA DE SER UN ARRAYLIST DE CLASE2

    Clase1(String n) { //¿DE DONDE VIENE N?
        nombreClase = n;
    }
    //HABRIA QUE HACER UN ARRAYLIST DE ASIGNATURA
    //AS COMO MAXIMO PUEDE TENER 5 ASIGNATURAS
    // añade asignatura si pasan cosas...

    //NO ES ASIGNATURA ES CONTAR ASIGNATURA 
    public void contarAsignatura(clase2 persona) throws Exception { // NO TIENE SENTIDO PASAR  CLASE2 AS HABRIA QUE PASAR ALGO RELLENADO
        for (int i = 0; i < asignatura.length; i++) { //NO TIENE SENTIDO O NO LO ENTIENDO YO 
            if (asignatura[i] == null) {
                asignatura[i] = persona;
            }
            if (i > numeroMaxAsignatura && asignatura[i] != null) {
                throw new Exception("No puede haber mas de cinco asignaturas");
            }
        }
    }
}
