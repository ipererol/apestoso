package org.example;

import java.util.ArrayList;

public class Clase_3 {
    public float subjectName ;
    public int maxNStudents = 50;
    public int matriculatedStudents = 0;
    ArrayList<clase2> students ;

    public Clase_3(float name) {
        subjectName = name;
        students =   new ArrayList<>();
    }

    public int addPerson(clase2 classeo) {
        if (matriculatedStudents < 50) {
            students.set(matriculatedStudents, classeo);
            matriculatedStudents++;
            return 1;
        } else {
            return 0;
        }
    }

    public clase2 nameStudent(int n) throws Exception {
        if (students[n] == null)
            return students[n];
        else
            throw new Exception("excepcion");
    }

    public boolean unsuscribeStudent(String name) {
        int i = 0;
        for(clase2 c4 : students) {
            if(students[i].equals(new clase2(name)))
                break;
            i++;
        }
        if(i==50) {
            return false;
        } else {
            students[i] = null;
            return false;
        }
    }
}
