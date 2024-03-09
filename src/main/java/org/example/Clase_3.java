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
    public clase2 nombrarAlumno(int posicion) throws Exception {
        bool fueraDeRango = (posicion < 0 || posicion >= alumnado.length); 
        String noExiste = "no existe alumno en la posición " + posicion;    
        if (fueraDeRango) {
            throw new Exception(noExiste);
        }
        clase2 alumno = alumnado[posicion];        
        if (alumno == null) {
            throw new Exception(noExiste);
        } else {
            return alumno;
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
