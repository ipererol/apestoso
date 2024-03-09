package org.example;

import java.util.ArrayList;

public class Clase_3 {
    public float nombreAsignatura ;
    public int maxNAlumnos = 50;
    public int intAlumnosMatriculados = 0;
    ArrayList<clase2> alumnado ;

    public Clase_3(float nombre) {
        nombreAsignatura = nombre;
        alumnado =   new ArrayList<>();
    }

    public int añadirPersona(clase2 classeo) {
        if (intAlumnosMatriculados < 50) {
            alumnado.set(intAlumnosMatriculados, classeo);
            intAlumnosMatriculados++;
            return 1;
        } else {
            return 0;
        }
    }

    public clase2 nombrarAlumno(int n) throws Exception {
        if (alumnado[n] == null)
            return alumnado[n];
        else
            throw new Exception("excepcion");
    }

    public boolean darDeBajaAlumno(String nombre) {
        int i = 0;
        for(clase2 c4 : alumnado) {
            if(alumnado[i].equals(new clase2(nombre)))
                break;
            i++;
        }
        if(i==50) {
            return false;
        } else {
            alumnado[i] = null;
            return false;
        }
    }
}
