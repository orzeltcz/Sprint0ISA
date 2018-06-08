package com.infoshareacademy.task4;

import com.infoshareacademy.task3.Task3;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Task4 {


    private static void drukuj(boolean a) {
        if (a == true) {
            System.out.println("Liczba jest palindromem");
        } else
            System.out.println("Liczba nie jest palindromem");
    }

    public static void palindrom() {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj liczbę do sprawdzenia: ");
        Long a = skaner.nextLong();
        if (a > 9) {
            String b = a.toString();
            char[] c = b.toCharArray();

            int checkTableSize = c.length / 2 + 1;
            boolean finalMessage = true;
            boolean[] checkTable = new boolean[checkTableSize];
            for (int i = 1; i <= c.length / 2; i++) {
                if (c[i - 1] == c[c.length - i]) {
                    checkTable[i - 1] = true;
                } else {
                    checkTable[i - 1] = false;

                }

            }
            for (int i = 0; i < c.length / 2; i++) {
                if (checkTable[i] == false) {
                    Task4.drukuj(checkTable[i]);
                    break;
                } else {
                    Task4.drukuj(checkTable[i]);
                    break;
                }
            }
        }else{
            System.out.println("liczba jest palindromem");
        }
    }

}
