package com.infoshareacademy;

import com.infoshareacademy.task2.Operatory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("I: dodawanie");
        System.out.println("II: odejmowanie");
        System.out.println("III: mnozenie");
        System.out.println("IV: dzielenie");
        System.out.println("Podaj działanie:");
        String wybor = scanner.next();
        Operatory a[] = Operatory.values();
        for(int i=0;i<a.length;i++){
            if(wybor.equals(a[i]))
            System.out.println(a[i]);
        }


    }
}
