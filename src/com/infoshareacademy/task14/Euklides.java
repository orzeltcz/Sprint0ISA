package com.infoshareacademy.task14;

import java.util.Scanner;

public class Euklides {

    public void firstPrint(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwie liczby nieujemne:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        euklides(a,b);
    }
    private void euklides(int a,int b){
        int helperA = a;
        int helperB = b;
        if(helperA>0 || helperB>0){
            if(helperA<helperB) euklides(helperB-helperA,helperA);
            else if(helperB<helperA) euklides(helperA-helperB,helperB);
            else System.out.println(helperA);

        }else{
            System.out.println("podales zle liczby!");
        }
    }
}
