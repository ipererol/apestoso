package org.example;

import org.example.Person;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a;
        // 1º A
        ArrayList<Person> peopleOfSubject1 = new ArrayList<>();
        Person p1 = new Person("Paco", 02, 11, 2004);
        peopleOfSubject1.add(p1);
        Person p2 = new Person("Penelope", 05, 04, 2010);
        peopleOfSubject1.add(p2);
        Person p3 = new Person("Mariano", 17, 12, 2001);
        peopleOfSubject1.add(p3);
        Person p4 = new Person("Austin", 22, 10, 2002);
        peopleOfSubject1.add(p4);
        Person p5 = new Person("Joseph", 02, 11, 2004);
        peopleOfSubject1.add(p5);
        Person p6 = new Person("Manolo", 12, 04, 1984);
        peopleOfSubject1.add(p6);

        ArrayList<Subject> Degree1A = new ArrayList<>();
        Subject subj1 = new Subject("Matemáticas", peopleOfSubject1);
        Degree1A.add(subj1);
        Subject subj2 = new Subject("Historia", peopleOfSubject1);
        Degree1A.add(subj2);
        Subject subj3 = new Subject("Química", peopleOfSubject1);
        Degree1A.add(subj3);
        // 1º B
        ArrayList<Person> peopleOfSubject2 = new ArrayList<>();
        Person p7 = new Person("Luis", 02, 11, 2004);
        peopleOfSubject2.add(p7);
        Person p8 = new Person("Ingrid", 05, 04, 2010);
        peopleOfSubject2.add(p8);
        Person p9 = new Person("Miguel", 17, 12, 2001);
        peopleOfSubject2.add(p9);
        Person p10 = new Person("Nacho", 22, 10, 2002);
        peopleOfSubject2.add(p10);
        Person p11 = new Person("Daniel", 02, 11, 2004);
        peopleOfSubject2.add(p11);
        Person p12 = new Person("Jorge", 12, 04, 1984);
        peopleOfSubject2.add(p12);

        ArrayList<Person> people = new ArrayList<>();
        getPeople(people, peopleOfSubject1);
        getPeople(people, peopleOfSubject2);
        
        ArrayList<Subject> Degree1B = new ArrayList<>();
        Subject subj4 = new Subject("Matemáticas", peopleOfSubject2);
        Degree1B.add(subj1);
        Subject subj5 = new Subject("Historia", peopleOfSubject2);
        Degree1B.add(subj2);
        Subject subj6 = new Subject("Química", peopleOfSubject2);
        Degree1B.add(subj3);
        
        ArrayList<Subject> Degrees = new ArrayList<>();
        getDegrees(Degrees, Degree1A);
        getDegrees(Degrees, Degree1B);
        
        ArrayList<Degree> classes = new ArrayList<>();
        Degree deeg1 = new Degree("1 A", subj1);
        try {
            deeg1.addSubject(subj2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            deeg1.addSubject(subj3);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        classes.add(deeg1);
        
        Degree deeg2 = new Degree("1 B", subj4);
        try {
            deeg2.addSubject(subj5);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            deeg2.addSubject(subj6);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        classes.add(deeg2);
        
        p1.addBrother("Francisco");
        p1.addBrother("Fernando");
        p1.addBrother("Luis");
        p1.setFirstParent("Ramon");
        p1.setSecondParent("Lucía");
        
        System.out.println("-----------Descripción de la aplicación------------");
        System.out.println("En esta clase Main, se prueban los métodos que");
        System.out.println("consultan datos sobre los distintos objetos creados.");
        System.out.println("Las personas, clases y asignaturas vendrán definidas");
        System.out.println("y no se podrán crear nuevas durante la ejecución.");
        System.out.println("----------------------------------------------------");
        do {
            System.out.println("Introduzca un número para: ");
            System.out.println("1) Listar a todas las personas");
            System.out.println("2) Listar a las personas que tengan familia numerosa.");
            System.out.println("3) Listar las personas que son huerfanos.");
            System.out.println("4) Mostrar los hermanos de la persona ");
            System.out.println("5) Mostrar todas las personas en un curso");
            System.out.println("6) Mostrar todas las personas matriculadas en una asignatura");
            System.out.println("7) Mostrar la edad de todas las personas");
            a = s.nextLine();
            if (!a.equals("0")) {
                if (a.equals("1")) {
                    listPeople(people);
                } else if (a.equals("2")) {
                    largeFamilies(people);
                } else if (a.equals("3")) {
                    listExpositos(people);
                } else if (a.equals("4")){
                    nameBrothers(people, s);
                }  else if (a.equals("5")){
                    showAllStudentsInGrade(classes);
                }  else if (a.equals("6")){
                    for (Subject subject : Degrees) {
                        showEnrolledStudents(subject);
                    }
                }  else if (a.equals("7")){
                    showAge(people);
                }
            }
        } while (!a.equals("0"));
    }

    public static void listPeople(ArrayList<Person> people) {
        System.out.println("Listado de personas:");
        for (Person personTmp : people) {
            System.out.println(personTmp.getName());
        }
    }

    public static void largeFamilies(ArrayList<Person> people) {
        for (Person person : people) {
            if (person.largeFamily()) {
                System.out.println(person.getName());
            }
        }
    }
    public static void listExpositos(ArrayList<Person> people) {
        for (Person person : people) {
            if (person.get_Exposito() == true) {
                System.out.println(person.getName() + " es exposito");
            }
        }
    }

    public static void nameBrothers(ArrayList<Person> people, Scanner s) {
        String search;
        System.out.println("Introduce el nombre de la persona.");
        search = s.nextLine();
        for (Person person : people) {
            if (person.getName().equals(search)) {
                for (Person brother : person.getBrothers()) {
                    if (!brother.getName().equals(person.getName())) {
                        System.out.println("-" + brother.getName());
                    }
                }
            }
        }

    }
    public static void showAllStudentsInGrade(ArrayList<Degree> classes){
        System.out.println("-------------- Alumnos por curso --------------");
        for (Degree actualClass : classes) {
            System.out.println("Clase " + actualClass.nameDegree);
            ArrayList<Subject> subjects = actualClass.listSubject;
            for (Subject subject : subjects) {
                showEnrolledStudents(subject);
            }
        }
        
    }
    public static void showEnrolledStudents(Subject subject) {
        System.out.println("Alumnos matrículados en " + subject.subjectName + ":");
        for (Person student : subject.students) {
            if (student != null) {
                System.out.println(student.getName());
            }
        }
        System.out.println("-----------------------------");
    }
    
    public static void showAge(ArrayList<Person> people) {
        for (Person person : people) {
            System.out.println(person.getName() + "tiene " + person.getAge());
        }
    }
    public static void getPeople(ArrayList<Person> people, ArrayList<Person> peopleOfSubject){
        for (Person person : peopleOfSubject) {
            people.add(person);
        }
    }
    public static void getDegrees(ArrayList<Subject> Degrees, ArrayList<Subject> actualDegree){
        for (Subject subject : actualDegree) {
            if (Degrees.contains(subject)) {
                for (Person student : subject.students) {
                    for (Subject Degree : Degrees) {
                        if (Degree.equals(subject)) {
                            Degree.addPerson(student);
                        }
                    }
                }
            }else{
                Degrees.add(subject);
            }
        }
    }
}
