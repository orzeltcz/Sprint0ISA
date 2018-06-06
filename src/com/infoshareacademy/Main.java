package com.infoshareacademy;


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
        System.out.println(iloczyn(3, -4));
        System.out.println(iloczynSuma(-2, -3));
    }
}
