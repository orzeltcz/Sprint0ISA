package com.infoshareacademy.task13;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Tables {

Set<Integer> sortedTables = new TreeSet<>();

    public void enterData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiary tablicy 1");
        int dimension1 = scanner.nextInt();
        int[] tab1 = new int[dimension1];
        for (int i = 0; i < dimension1; i++) {
            tab1[i] = scanner.nextInt();
        }
        System.out.println("Podaj rozmiary tablicy 2");
        int dimension2 = scanner.nextInt();
        int[] tab2 = new int[dimension2];
        for (int i = 0; i < dimension2; i++) {
            tab2[i] = scanner.nextInt();
        }
        for (int i = 0; i < dimension1; i++) {
            this.sortedTables.add(tab1[i]);
            for (int j = 0; j < dimension2; j++) {
                this.sortedTables.add(tab2[j]);
            }
        }
        print();
    }

    private void print(){
        for (Integer a : this.sortedTables) {
            System.out.print(a+" ");
        }
    }
}
