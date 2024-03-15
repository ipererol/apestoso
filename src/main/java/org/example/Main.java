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

        } while (!answer.equals("6"));
    }

    public static void menu(Scanner sc, ArrayList<Student> degreeAl ) {
        String respuesta = "";
        do {
            System.out.println("---Elige una opcion---");
            System.out.println(" 1. Añadir alumno.");
            System.out.println(" 2. Añadir Curso. ");
            System.out.println(" 3. Listar Curso.");
            System.out.println(" S. Salir");
            
            respuesta = sc.nextLine();
          if (!(respuesta.equals("1")) || (respuesta.equals("2"))
                || (respuesta.equals("3")) || (respuesta.equals("S"))) {
            System.out.println("Respuesta incorrecta. solo 1,2,3 o S para salir");
        }
 
        } while (!(respuesta.equals("1")) || (respuesta.equals("2"))
                || (respuesta.equals("3")) || (respuesta.equals("S")));
        
        if (respuesta.equals("1")) {
            addStudent(sc,degreeAl );
        }else if (respuesta.equals("2")){
            //Añadir Curso//
        }else if (respuesta.equals("3")){
            System.out.println("---Listado del curso---");
            for (Student student1 : degreeAl) {
                System.out.println(student1);
            }
        }
    }

    public static void addStudent(Scanner sc, ArrayList<Student> degreeAl) {
        String answer, studentName, parent1Name, parent2Name, dateOfBitrthday;
        do {
            System.out.print("---Introduzca lod datos del alumno: ---");
            System.out.print(" Introduzca el nombre completo del alumno: / o introduzca S para salir ");
            studentName = sc.nextLine();
            if (!studentName.equals("S")) {
                System.out.println(" Introduzca la fecha de nacimiento del alumno: ");
                dateOfBitrthday = sc.nextLine();
                System.out.print(" Introduzca el tutor 1: ");
                parent1Name = sc.nextLine();
                System.out.print(" Introduzca el tutor 2:");
                parent2Name = sc.nextLine();
                Student tmp = Student();
                degreeAl.add(tmp);
            }

        } while (!studentName.equals("S"));
    }
    
    public static void addDegree(Scanner sc);

}
