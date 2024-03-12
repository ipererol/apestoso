package org.example;

import java.util.ArrayList;

public class Subject {
     public String subjectName ;
    public int maxNStudents = 50;
    public int matriculatedStudents = 0;
    ArrayList<Person> students ;

    public Subject(String subjectName, ArrayList<Person> students) {
        this.subjectName = subjectName;
        this.students = students;
    }



      public int addPerson(Person classeo) {
        if (matriculatedStudents < 50) {
            students.set(matriculatedStudents, classeo);
            matriculatedStudents++;
            return 1;
        } else {
            return 0;
        }
    }

    public Person nameStudent(int position) throws Exception {
        boolean outOfRange = (position < 0 || position >= students.size()); 
        String notExists = "Ah ah ah, you didn't say the magic word. There is no student in position " + position;    
        if (outOfRange) {
            throw new Exception(notExists);
        }
        Person student = students.get(position);        
        if (student == null) {
            throw new Exception(notExists);
        } else {
            return student;
        }
    }

    public boolean withdrawStudent(String nombre) {
        for(int i = 0; i < students.size(); i++) {
            Person student = students.get(i);
            if(student != null && student.getName().equals(nombre)){
                students.remove(i);
                matriculatedStudents--;
                return true;
            }
       }
            return false;
    }
}
