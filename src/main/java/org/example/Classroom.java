package org.example;

import java.util.ArrayList;

public class Classroom {

    private String degreeName;
    private final int MAX_SEATS;
    private final int MAX_SUBJECTS;
    private ArrayList<Subject> subjects;
    private ArrayList<Student> students;

    public Classroom(String degreeName, int maxSeats, int maxSubjects, ArrayList<Subject> subjects, ArrayList<Student> students) throws Exception {
        this.degreeName = degreeName;
        this.MAX_SEATS = maxSeats;
        this.students = students;

        if (maxSeats <= 0) {
            throw new Exception("Tiene que haber menos de 0 plazas");
        }
        if (maxSeats > 35) {
            throw new Exception("Tiene que haber mas de 35 plazas");
        }

        this.MAX_SUBJECTS = maxSubjects;

        if (subjects.size() > maxSubjects) {
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

    public ArrayList<Subject> getSubjects() {
        return new ArrayList<>(subjects);
    }

    public void addSubject(Subject subject) throws Exception {
        if (subjects.size() <= MAX_SUBJECTS) {

            subjects.add(subject);
        } else {
            throw new Exception("Maximo de materias alcanzado");
        }

    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

}
