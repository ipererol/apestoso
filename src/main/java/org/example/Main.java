package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String b = "";
        do {
            Scanner s1 = new Scanner(System.in);
            String a = s1.next();
            b = s1.nextInt() + "";
            if (a == a) {
                Clase1 clase1 = new Clase1(a);
            }
        } while(b != "\n");
    }
}