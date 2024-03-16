package org.example;

import java.util.ArrayList;

public class Subject {

    private String subjectName;
    private ArrayList<Student> students;
    private final int MAX_STUDENTS;

    public Subject(String SubjectName, ArrayList<Student> people, int MAX_STUDENTS) {
        this.subjectName = SubjectName;
        this.students = people;
        this.MAX_STUDENTS = MAX_STUDENTS;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int getMAX_STUDENTS() {
        return MAX_STUDENTS;
    }

    public void addStudent(Student student) throws Exception {

        if (students.size() < MAX_STUDENTS) {
            students.add(student);

        } else {
            throw new Exception("Ha superado el maximo de alumnos");

        }
    }
    public void removeStudent(Student student) throws Exception {

        if (students.size() < 0) {
            students.remove(student);

        } else {
            throw new Exception("Numero negativo en materia no valido");

        }
    }

    public void listStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
