package com.infoshareacademy.task11;

import java.util.Scanner;

public class Decimal {

    public static void Binary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe dziesietną");
        Integer decimal = scanner.nextInt();
        System.out.println("Binarnie: "+decimal.toBinaryString(decimal));

    }
}
