package org.example;

import java.util.*;

public class Classroom {

    public String degreeName;
    public ArrayList<Student> students;
    public static final int MAX_STUDENTS = 50;
    public static int studentsEnrolled = 0;

    public Classroom(String nombreAsignatura, ArrayList<Student> alumnado) {
        this.degreeName = nombreAsignatura;
        this.students = alumnado;
    }

    public void addPersonToClasroom(clase2 classeo) throws Exception {
        if (studentsEnrolled < 50) {
            students.add(classeo);
            studentsEnrolled++;
        }
    }

    public clase2 nombrarAlumno(int n) throws Exception {
        if (students.get(n) != null) {
            return students.get(n);
        } else {
            throw new Exception("Error, no existe el alumno");
        }
    }

    public void darDeBajaAlumno(String nombre) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getNombre_ALUMNO().equals(nombre)) {
                students.remove(i);
                i--;
            }
        }
    }
}
