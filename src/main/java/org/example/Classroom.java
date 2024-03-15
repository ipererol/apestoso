package org.example;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private String degreeName;
    private final int MAX_SEATS;
    private final int MAX_SUBJECTS;
    private ArrayList<Subject> subjects;

    public Classroom(String degreeName, int maxSeats, int maxSubjects, List<Subject> subjects) throws Exception {
        this.degreeName = degreeName;
        this.MAX_SEATS = maxSeats;

        if (maxSeats <= 0) {
            throw new Exception("Tiene que haber menos de 0 plazas");
            //implementar excepcion
        }
        if (maxSeats > 35) {
            //implementar excepcion
            throw new Exception("Tiene que haber mas de 35 plazas");
        }

        this.MAX_SUBJECTS = maxSubjects;

        if (subjects.size() > maxSubjects) {
            //implementar excepcion
            throw new Exception("No puede haber mas de " + maxSubjects + " materias");

        }

        this.subjects = new ArrayList<>(subjects);
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public int getMaxSeats() { // Use getters for constants
        return MAX_SEATS;
    }

    public int getMaxSubjects() { // Use getters for constants
        return MAX_SUBJECTS;
    }

    public List<Subject> getSubjects() {
        return new ArrayList<>(subjects);
    }

    public void addSubject(Subject subject) throws Exception {
        // Validar si se ha alcanzado el límite de asignaturas
        if (subjects.size() <= MAX_SUBJECTS) {

            subjects.add(subject);
        } else {
            //implementar excepcion
            throw new Exception("Maximo de materias alcanzado");
        }

    }

}
