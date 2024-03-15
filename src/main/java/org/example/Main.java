package org.example;

import org.example.Person;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a;
        ArrayList<Person> people = new ArrayList<>();
        Person p1 = new Person("Paco", 02, 11, 2004);
        people.add(p1);
        Person p2 = new Person("Penelope", 05, 04, 2010);
        people.add(p2);
        Person p3 = new Person("Mariano", 17, 12, 2001);
        people.add(p3);
        Person p4 = new Person("Austin", 22, 10, 2002);
        people.add(p4);
        Person p5 = new Person("Joseph", 02, 11, 2004);
        people.add(p5);
        Person p6 = new Person("Manolo", 12, 04, 1984);
        people.add(p6);
        
        p1.addBrother("Francisco");
        p1.addBrother("Fernando");
        p1.addBrother("Luis");
        p1.setFirstParent("Paco");
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
                    
                }  else if (a.equals("5")){
                    
                }  else if (a.equals("6")){
                    
                }  else if (a.equals("7")){
                    showAge(people);
                }
            }
        } while (!a.equals("0"));
    }

    public static void listPeople(ArrayList<Person> people) {
        System.out.println("Listado de personas:");
        for (Person personTmp : people) {
            System.out.println(personTmp);
        }
    }

    public static void largeFamilies(ArrayList<Person> people) {
        for (Person person : people) {
            if (person.largeFamily()) {
                System.out.println(person);
            }
        }
    }
    public static void listExpositos(ArrayList<Person> people) {
        for (Person person : people) {
            if (person.get_Exposito() == true) {
                System.out.println(person + " es exposito");
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
                    System.out.println("-" + brother.getName());
                }
            }
        }

    }
    
    public static void showAge(ArrayList<Person> people) {
        for (Person person : people) {
            System.out.println(person.getName() + "tiene " + person.getAge());
        }
    }

}
