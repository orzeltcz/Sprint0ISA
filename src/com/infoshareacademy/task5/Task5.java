package com.infoshareacademy.task5;

import java.util.Scanner;

public class Task5 {
    public static void litery(){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj stringa");
        String ciag = skaner.nextLine();
        String ciagBezSpacji=ciag.replace(" ","");
        char[] stringChar = ciagBezSpacji.toCharArray();

        if(alphabet.length>stringChar.length) {
            for (int i = 0; i <alphabet.length; i++) {
                for (int j = 0; j <stringChar.length; j++) {
                    if (stringChar[j] == alphabet[i]) alphabet[i] = 0;
                }
            }
        }
        for (int i = 0; i <alphabet.length ; i++) {
            if(alphabet[i]!=0) System.out.print(" "+alphabet[i]);
        }
    }
}
