package org.example;

public class Clase_3 {
    public float nombreAsignatura ;
    public clase2[] alumnado;
    public int maxNALIUMNOS = 50;
    public int intALumnos_matriculaos = 0;

    public Clase_3(float nombre) {
        nombreAsignatura = nombre;
        alumnado = new clase2[maxNALIUMNOS];
    }

    public int aniadirPersona(clase2 classeo) {
        if (intALumnos_matriculaos < 50) {
            alumnado[intALumnos_matriculaos] = classeo;
            intALumnos_matriculaos++;
            return 1;
        } else {
            return 0;
        }
    }
//Clase 2 convendría que lo llamaramos "Alumno"
    public clase2 nameStudent(int position) throws Exception {
        bool outOfRange = (position < 0 || position >= studentBody.length); 
        String notExists = "Ah ah ah, you didn't say the magic word. There is no student in position " + position;    
        if (outOfRange) {
            throw new Exception(notExists);
        }
        clase2 student = studentBody[position];        
        if (student == null) {
            throw new Exception(notExists);
        } else {
            return student;
        }
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
