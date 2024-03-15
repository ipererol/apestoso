package org.example;

import java.util.*;

public class Classroom {

    public String nombreAsignatura;
    public ArrayList<clase2> alumnado;
    public static final int MAX_ALUMNO = 50;
    public static int ALUMNOS_MATRICULADOS = 0;

    public Classroom(String nombreAsignatura, ArrayList<clase2> alumnado) {
        this.nombreAsignatura = nombreAsignatura;
        this.alumnado = alumnado;
    }

    public void anyadirPersona(clase2 classeo) throws Exception {
        if (ALUMNOS_MATRICULADOS < 50) {
            alumnado.add(classeo);
            ALUMNOS_MATRICULADOS++;
        }
    }

    public clase2 nombrarAlumno(int n) throws Exception {
        if (alumnado.get(n) != null) {
            return alumnado.get(n);
        } else {
            throw new Exception("Error, no existe el alumno");
        }
    }

    public void darDeBajaAlumno(String nombre) {
        for (int i = 0; i < alumnado.size(); i++) {
            if (alumnado.get(i).getNombre_ALUMNO().equals(nombre)) {
                alumnado.remove(i);
                i--;
            }
        }
    }
}
