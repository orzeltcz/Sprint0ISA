package com.infoshareacademy.task14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Euklides {
private int a;
private int b;
    public void firstPrint() throws AmountBelowZeroException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwie liczby nieujemne:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a<=0 || b<=0) throw new AmountBelowZeroException();
        this.a=a;
        this.b=b;
        commonDeviders(a,b);
    }

    private void commonDeviders(int a,int b){
        List<Integer> dividers1 = new ArrayList<>();
        List<Integer> dividers2 = new ArrayList<>();

        for (int i = 1; i <= a; i++) {
            if(a%i==0) dividers1.add(i);

        }
        for (int i = 1; i <= b; i++) {
            if(b%i==0) dividers2.add(i);
        }
        compare(dividers1,dividers2);
    }
    private void compare(List<Integer> dividers1,List<Integer> dividers2) {
        List<Integer> commonDeviders = new ArrayList<>();

        for (Integer b : dividers2) {
            if (dividers1.contains(b)) commonDeviders.add(b);

        }
        print(commonDeviders);
    }
    private void print(List<Integer> commonDeviders) {
        System.out.println();
        System.out.println("Wszystkie dzielniki liczb "+a+" i "+b);
        for (Integer b : commonDeviders) {
            System.out.print(b + " ");
        }
    }

}
