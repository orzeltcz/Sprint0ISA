package com.infoshareacademy;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
   public static void losowanie () {
       Scanner skaner = new Scanner(System.in);
       int x = 0, y = 0, z = 0, values = 0;
       System.out.println("Podaj liczbe i przedzialy");
       y = skaner.nextInt();
       z = skaner.nextInt();

       int numberOfCharsInRow = 0;
       if (y > z && y > 0 && z > 0) {

           numberOfCharsInRow = y / z;
           int valuesTable[][] = new int[z][numberOfCharsInRow];

           //zerowanie tablicy
           for (int i = 0; i < z; i++) {
               for (int j = 0; j < numberOfCharsInRow; j++) {
                   valuesTable[i][j] = -1;
               }
           }
           //tworzenie tablicy przedzialow
           if (y % z == 0 && z != y) {
               for (int i = 0; i < z; i++) {
                   for (int j = 0; j < numberOfCharsInRow; j++) {
                       valuesTable[i][j] = values;
                       values++;
                   }
               }
           } else {
               System.out.println("Podaj liczby z rownym zakresem!");
           }
           int amountOfRoll = 0;
           System.out.println("Podaj ilosc losowan");
           amountOfRoll = skaner.nextInt();
           int[] scoreTable = new int[z];
           Random random = new Random();
           int rand;
           //zerowanie wynikow
           for (int i = 0; i < z; i++) {
               scoreTable[i] = 0;
           }

           for (int i = 0; i < amountOfRoll; i++) {
               rand = random.nextInt(y);
               for (int k = 0; k < z; k++) {
                   for (int j = 0; j < numberOfCharsInRow; j++) {
                       if (valuesTable[k][j] == rand) scoreTable[k] += 1;

                   }
               }
           }
           System.out.println();
           // wyniki
           System.out.println("Wyniki");
           for (int i = 0; i < z; i++) {
               System.out.print(valuesTable[i][0] + "-" + valuesTable[i][numberOfCharsInRow - 1] + " ");
           }
           System.out.println();
           for (int i = 0; i < z; i++) {

               System.out.print(" " + scoreTable[i]);
           }
       }else System.out.println("blad");
   }


}
