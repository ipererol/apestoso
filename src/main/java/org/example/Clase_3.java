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
