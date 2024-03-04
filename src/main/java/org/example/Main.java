package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
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
        
        listPersons(people);
    }
    
    public static void listPersons(ArrayList<Person> people){
        for (Person personTmp : people) {
            System.out.println(personTmp);
        }
    }
}
