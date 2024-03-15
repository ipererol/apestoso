package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    static final int MAX_STUDENTS = 30;
    static final int MAX_SUBJECTS = 6;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        File f = new File("./DAW.txt");
        Scanner scFile = null;
        Classroom daw;
        try {
            scFile = new Scanner(f);

            daw = startClassClassroom(scFile);
            menu(sc, daw.getStudents());
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void menu(Scanner sc, ArrayList<Student> students) {
        String answer = "";
        do {
            System.out.println("---Elige una opcion---");
            System.out.println(" 1. Añadir alumno.");
            System.out.println(" 2. Listar Curso.");
            System.out.println(" 3. Eliminar alumno.");
            System.out.println(" S. Salir");

            answer = sc.nextLine();
            if (!((answer.equals("1")) || (answer.equals("2"))
                    || (answer.equals("3")) || (answer.equalsIgnoreCase("S")))) {
                System.out.println("Respuesta incorrecta. solo 1,2,3,4 o S para salir");
            }

        } while (!((answer.equals("1")) || (answer.equals("2"))
                || (answer.equals("3")) || (answer.equalsIgnoreCase("S"))));

        if (answer.equals("1")) {
            addStudent(sc, students);
        } else if (answer.equals("2")) {
            System.out.println("---Listado del curso---");
            for (Student student : students) {
                System.out.println(student);
            }
        } else if (answer.equals("3")) {
            deleteStudents(sc, students);
        }
    }

    public static void addStudent(Scanner sc, ArrayList<Student> students) {
        ArrayList<Person> siblings;
        String studentName, parent1Name, parent2Name, dateOfBitrthday;
        Student tmp;

        do {
            System.out.println("---Introduzca los datos del alumno: ---");
            System.out.println(" Introduzca el nombre completo del alumno: / o introduzca S para salir ");
            studentName = sc.nextLine();
            if (!studentName.equalsIgnoreCase("S")) {
                System.out.println(" Introduzca la fecha de nacimiento del alumno(yyyy-mm-dd): ");
                dateOfBitrthday = sc.nextLine();
                System.out.print(" Introduzca el tutor 1: ");
                parent1Name = sc.nextLine();
                System.out.print(" Introduzca el tutor 2:");
                parent2Name = sc.nextLine();
                siblings = addSiblings(sc);
                if (siblings.isEmpty()) {
                    tmp = new Student(dateOfBitrthday, parent1Name, parent2Name, studentName);
                } else {
                    tmp = new Student(dateOfBitrthday, parent1Name, parent2Name, siblings, studentName);
                }
                students.add(tmp);
            }

        } while (!studentName.equalsIgnoreCase("S"));
    }

    public static void deleteStudents(Scanner sc, ArrayList<Student> students) {
        String nameStudentDelete;
        Student tmp = null;
        System.out.println("---Introduzca los datos del alumno a borrar: ---");
        nameStudentDelete = sc.nextLine();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(nameStudentDelete)) {
                tmp = students.get(i);
            }
        }
        if (tmp != null) {
            students.remove(tmp);
        } else {
            System.out.println("El estudiante introducido no esta presente en la lista.");
        }
    }

    public static ArrayList<Person> addSiblings(Scanner sc) {
        ArrayList<Person> siblings = new ArrayList<>();
        String answer, nameSibling;
        System.out.println("¿Tiene hermanos? (s/n)");
        answer = sc.nextLine();

        if (answer.equalsIgnoreCase("s")) {
            do {
                System.out.println("Introduzca el nombre del hermano/a (para finalizar FIN): ");
                nameSibling = sc.nextLine();
                if (!nameSibling.equals("FIN")) {
                    siblings.add(new Person(nameSibling));
                }
            } while (!nameSibling.equals("FIN"));
        } else {

        }
        return siblings;
    }

    public static Classroom startClassClassroom(Scanner scFile) throws Exception {
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Subject> subjectList;
        String studenData, birthdate, nameStudent;

        while (scFile.hasNextLine()) {
            studenData = scFile.nextLine();

            String[] tmp = studenData.split(",");
            birthdate = tmp[3] + "-" + tmp[2] + "-" + tmp[1];
            nameStudent = tmp[0];

            studentList.add(new Student(birthdate, "Enrique Nogal", "Nuestras madres", nameStudent));

        }

        subjectList = startSubjects(studentList);

        for (Student student : studentList) {
            System.out.println(student);
        }

        Classroom tmp = new Classroom("DAW", MAX_STUDENTS, MAX_SUBJECTS, subjectList, studentList);
        return tmp;

    }

    public static ArrayList<Subject> startSubjects(ArrayList<Student> studentList) {
        ArrayList<Subject> subjectList = new ArrayList<>();

        subjectList.add(new Subject("Entornos de desarrollo", studentList, MAX_STUDENTS));
        subjectList.add(new Subject("Programación", studentList, MAX_STUDENTS));
        subjectList.add(new Subject("Lenguaje de martas", studentList, MAX_STUDENTS));
        subjectList.add(new Subject("Base de gatos", studentList, MAX_STUDENTS));
        subjectList.add(new Subject("Sistemas informaticos", studentList, MAX_STUDENTS));

        return subjectList;
    }

}
