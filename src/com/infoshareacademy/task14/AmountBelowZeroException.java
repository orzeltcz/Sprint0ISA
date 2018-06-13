package com.infoshareacademy.task14;

public class AmountBelowZeroException extends Exception {
    AmountBelowZeroException(){
        System.out.println("Podales liczbe 0 lub ponizej");
    }
}
