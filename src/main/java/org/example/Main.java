package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String b = "";
        String answer, studentName, parent1Name, parent2Name, dateOfBitrthday, subject;
        ArrayList<Student> degreeAl = new ArrayList<Student>();
        do {
            menu(sc, degreeAl);

        } while (true);
    }

    public static void menu(Scanner sc, ArrayList<Student> degreeAl ) {
        String answer = "";
        do {
            System.out.println("---Elige una opcion---");
            System.out.println(" 1. Añadir alumno.");
            System.out.println(" 2. Añadir Curso. ");
            System.out.println(" 3. Listar Curso.");
            System.out.println(" 4. Eliminar alumno.");
            System.out.println(" S. Salir");
            
            answer = sc.nextLine();
          if (!(answer.equals("1")) || (answer.equals("2"))
                || (answer.equals("3")) || (answer.equals("4")) || (answer.equals("S"))) {
            System.out.println("Respuesta incorrecta. solo 1,2,3,4 o S para salir");
        }
 
        } while (!(answer.equals("1")) || (answer.equals("2"))
                || (answer.equals("3")) || (answer.equals("4")) || (answer.equals("S")));
        
        if (answer.equals("1")) {
            addStudent(sc,degreeAl );
        }else if (answer.equals("2")){
            //Añadir Curso//
        }else if (answer.equals("3")){
            System.out.println("---Listado del curso---");
            for (Student student1 : degreeAl) {
                System.out.println(student1);
            }
        }else if (answer.equals("4")){
            deleteStudents(sc, degreeAl);
        }
    }

    public static void addStudent(Scanner sc, ArrayList<Student> degreeAl) {
        String answer, studentName, parent1Name, parent2Name, dateOfBitrthday;
        do {
            System.out.print("---Introduzca los datos del alumno: ---");
            System.out.print(" Introduzca el nombre completo del alumno: / o introduzca S para salir ");
            studentName = sc.nextLine();
            if (!studentName.equals("S")) {
                System.out.println(" Introduzca la fecha de nacimiento del alumno(yyyy-mm-dd): ");
                dateOfBitrthday = sc.nextLine();
                System.out.print(" Introduzca el tutor 1: ");
                parent1Name = sc.nextLine();
                System.out.print(" Introduzca el tutor 2:");
                parent2Name = sc.nextLine();
                Student tmp = new Student();
                degreeAl.add(tmp);
            }

        } while (!studentName.equals("S"));
    }
    public static void deleteStudents(Scanner sc, ArrayList<Student> degreeAl){
        String nameStudentDelete;
        Student tmp = null;
        System.out.println("---Introduzca los datos del alumno a borrar: ---");
        nameStudentDelete = sc.nextLine();
        
        for (int i = 0; i < degreeAl.size(); i++) {
            if (degreeAl.get(i).getName().equals(nameStudentDelete)) {
                tmp = degreeAl.get(i);
            }
        }
        if (tmp != null){
            degreeAl.remove(tmp);
        } else{
            System.out.println("El estudiante introducido no esta presente en la lista.");
        }
    }

}
