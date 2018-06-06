package com.infoshareacademy;


import java.util.Scanner;

public class Main {
    //Funkcja mnożenia z operatorem *
    public static int iloczyn(int a, int b) {
        return a * b;
    }

    //funkcja mnożenia bez operatora *
    public static int iloczynSuma(int a, int b) {
        int sum = 0;
        int h = b;
        if (h < 0) {
            h = -h;
        }

        for (int i = 0; i < h; i++) {
            sum = sum + a;
        }
        if (b < 0) {
            return -sum;
        } else return sum;
    }


    public static void main(String[] args) {
        System.out.printf("Podaj dwie liczby:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Funkcja z operatorem *: "+iloczyn(a, b));
        System.out.println("Funkcja bez operatora *: "+iloczynSuma(a, b));
    }
}
