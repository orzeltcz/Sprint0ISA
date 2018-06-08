package com.infoshareacademy.task6;

public class Task6 {
    public static int fibonnaci(int a){
        if(a==0) return 0;
        if(a==1) return 1;
        else return(fibonnaci(a-1)+fibonnaci(a-2));
    }
}
