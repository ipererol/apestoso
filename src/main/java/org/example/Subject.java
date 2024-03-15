package org.example;

import java.util.ArrayList;

public class Subject {

    private String subjectName;
    private ArrayList<Student> people;
    private final int MAX_STUDENTS;

    public Subject(String SubjectName, ArrayList<Student> people, int MAX_STUDENTS) {
        this.subjectName = SubjectName;
        this.people = people;
        this.MAX_STUDENTS = MAX_STUDENTS;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public ArrayList<Student> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Student> people) {
        this.people = people;
    }

    public int getMAX_STUDENTS() {
        return MAX_STUDENTS;
    }

    public void addStudent(Student student) throws Exception {

        if (people.size() < MAX_STUDENTS) {
            people.add(student);

        } else {
            throw new Exception("Ha superado el maximo de alumnos");

        }
    }

    public void listStudents() {
        for (Student student : people) {
            System.out.println(student);
        }
    }

}
