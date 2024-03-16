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

            menu(sc, daw);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void menu(Scanner sc, Classroom daw) throws Exception {
        String option;

        do {
            textoMenu();

            option = sc.nextLine();
            if (!option.equalsIgnoreCase("s")) {
                if (!option.equals("1") && !option.equals("2") && !option.equals("3")
                        && !option.equals("4") && !option.equals("5") && !option.equals("6") && !option.equals("7") && !option.equals("8")) {
                    System.out.println("Respuesta incorrecta. Solo 1,2,3,4,5,6,7,8 o S para salir");
                } else {
                    switch (option) {
                        case "1" -> addStudent(sc, daw.getStudents());
                        case "2" -> listarCurso(daw.getStudents());
                        case "3" -> deleteStudents(sc, daw.getStudents());
                        case "4" -> listSubjects(sc, daw.getSubjects());
                        case "5" -> unenrollStundent(sc, daw.getSubjects());
                        case "6" -> enrollStundent(sc, daw.getSubjects(), daw.getStudents());
                        case "7" -> listUntutored(daw.getStudents());
                        case "8" -> listLargeFamily(daw.getStudents());
                    }
                }

            }

        } while (!option.equalsIgnoreCase("s"));
    }

    public static void addStudent(Scanner sc, ArrayList<Student> students) {
        ArrayList<Person> siblings;
        String studentName, parent1Name, parent2Name, dateOfBitrthday;
        Student tmp;

        do {
            System.out.println("---Introduzca los datos del alumno: ---");
            System.out.println(" Introduzca el nombre completo del alumno: ");
            System.out.println("Introduce S para salir");
            studentName = sc.nextLine();
            if (!studentName.equalsIgnoreCase("S")) {
                System.out.println(" Introduzca la fecha de nacimiento del alumno(yyyy-mm-dd): ");
                dateOfBitrthday = sc.nextLine();
                System.out.print(" Introduzca el tutor 1: o null si no hay");
                parent1Name = sc.nextLine();
                if (parent1Name.equalsIgnoreCase("null")) {
               
                    parent1Name = "null";
                }
                System.out.print(" Introduzca el tutor 2: o null si no hay");
                parent2Name = sc.nextLine();
                if (parent2Name.equalsIgnoreCase("null")) {
                  
                    parent2Name = "null";
                }
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
        System.out.println("---Introduzca el nombre del alumno a borrar: ---");
        nameStudentDelete = sc.nextLine();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equalsIgnoreCase(nameStudentDelete)) {
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
                System.out.println("Introduzca el nombre del hermano/a: ");
                nameSibling = sc.nextLine();
                if (!nameSibling.equals("FIN")) {
                    siblings.add(new Person(nameSibling));
                }
                System.out.println("Para finalizar ingresa FIN");
            } while (!nameSibling.equalsIgnoreCase("FIN"));
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

            studentList.add(new Student(birthdate, "Enrique Nogal", "Mama de "+nameStudent, nameStudent));

        }
        scFile.close();
        subjectList = startSubjects(studentList);

        return new Classroom("DAW", MAX_STUDENTS, MAX_SUBJECTS, subjectList, studentList);

    }

    public static ArrayList<Subject> startSubjects(ArrayList<Student> studentList) {//inicializamos las variables de asignaturas
        ArrayList<Subject> subjectList = new ArrayList<>();

        subjectList.add(new Subject("Entornos de desarrollo", studentList, MAX_STUDENTS));
        subjectList.add(new Subject("Programación", studentList, MAX_STUDENTS));
        subjectList.add(new Subject("Lenguaje de martas", studentList, MAX_STUDENTS));
        subjectList.add(new Subject("Base de gatos", studentList, MAX_STUDENTS));
        subjectList.add(new Subject("Sistemas informaticos", studentList, MAX_STUDENTS));

        return subjectList;
    }

    private static void listarCurso(ArrayList<Student> students) {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------Listado de alumnos----------------------------------------------------------------------------------------------");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    private static void unenrollStundent(Scanner sc, ArrayList<Subject> subjects) throws Exception {
        String nameStudentDelete, subjectName;
        System.out.println("---Introduzca el nombre del alumno a borrar: ---");
        nameStudentDelete = sc.nextLine();

        System.out.println("---Introduzca el nombre del la asignatura a desmatricular: ---");
        subjectName = sc.nextLine();
        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i).getSubjectName().equalsIgnoreCase(subjectName)) {

                for (int j = 0; j < subjects.get(i).getStudents().size(); j++) {

                    if (subjects.get(i).getStudents().get(j).getName().equalsIgnoreCase(nameStudentDelete)) {

                        subjects.get(i).getStudents().remove(j);
                    }

                }

            }

        }

    }

    private static void enrollStundent(Scanner sc, ArrayList<Subject> subjects, ArrayList<Student> students) throws Exception {
        String nameStudentToAdd, subjectName;
        Student aux = null;
        System.out.println("---Introduzca el nombre del alumno a matricular----");
        nameStudentToAdd = sc.nextLine();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(nameStudentToAdd)) {
                aux = student;
            }
        }

        System.out.println("---Introduzca el nombre del la asignatura a matricular-------");
        subjectName = sc.nextLine();
        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i).getSubjectName().equalsIgnoreCase(subjectName)) {
                
                for (int j = 0; j < subjects.get(i).getStudents().size(); j++) {
                   
                    if (subjects.get(i).getStudents().get(j).getName().equalsIgnoreCase(nameStudentToAdd)) {

                        subjects.get(i).getStudents().add(aux);
                        
                    }
                    break;
                }

            }

        }

    }

    private static void listSubjects(Scanner sc, ArrayList<Subject> subjects) {
        System.out.println("-------------Ingrese asignatura a listar------------");
        String subjectName = sc.nextLine();
        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i).getSubjectName().equalsIgnoreCase(subjectName)) {
                for (Student student : subjects.get(i).getStudents()) {
                    System.out.println(student);
                }
            }

        }

    }

    private static void listLargeFamily(ArrayList<Student> students) {
        System.out.println("-------Alumnos con familia numerosa--------");
           int c=0;
        for (Student student : students) {
            if (student.isLargeFamily()) {
                System.out.println(student);
                c++;
            }
        }
          if (c==0)System.out.println("Ningun alumno no tiene tutor");
    }

    private static void listUntutored(ArrayList<Student> students) {
        System.out.println("--------------Alumnos sin tutores----------");
        int c=0;
        for (Student student : students) {

            if (!student.isTutored()) {
                System.out.println(student);
                c++;
            }
        }
        if (c==0)System.out.println("Ningun alumno no tiene tutor");
    }

    private static void textoMenu() {
        System.out.println("--------------------Elige una opcion---------------------");
            System.out.println(" 1. Añadir alumno.");
            System.out.println(" 2. Listar Curso.");
            System.out.println(" 3. Eliminar alumno.");
            System.out.println(" 4. Listar asignatura.");
            System.out.println(" 5. Desmatricular de asignatura a alumno.");
            System.out.println(" 6. Matricular en asignatura a alumno.(solo puedes matricularlo si no estaba anterior mente)");//by default all are enrolled in all Subjects
            System.out.println(" 7. Listar sin tutores legales.");
            System.out.println(" 8. Listar familia numerosa.");
            System.out.println(" S. Salir");
            System.out.println("----------------------------------------------------------");
    }

}
