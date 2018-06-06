package com.infoshareacademy;


public class Main {
    //Funkcja mnożenia z operatorem *
    public static int iloczyn(int a,int b){
        return a*b;
    }

    //funkcja mnożenia bez operatora *
    public static int iloczynSuma(int a,int b) {
        int suma=0;
        int h = b;
        if (h < 0) h = -h;

        for (int i = 0; i < h; i++) {
            suma = suma + a;
        }
        if (b < 0) return -suma;
        else return suma;
    }


    public static void main(String[] args) {
        System.out.println(iloczyn(3,-4));
        System.out.println(iloczynSuma(-2,-3));
    }
}
