package com.infoshareacademy;


import com.infoshareacademy.task1.Task1;

import java.util.Scanner;

public class Main {
    //Funkcja mnożenia z operatorem *

    public static void main(String[] args) {
        System.out.printf("Podaj dwie liczby:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Funkcja z operatorem *: "+Task1.iloczyn(a, b));
        System.out.println("Funkcja bez operatora *: "+Task1.iloczynSuma(a, b));
    }
}
