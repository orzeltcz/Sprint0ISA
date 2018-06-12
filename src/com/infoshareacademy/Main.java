package com.infoshareacademy;

import com.infoshareacademy.task1.Task1;
import com.infoshareacademy.task10.Fraction;
import com.infoshareacademy.task11.Decimal;
import com.infoshareacademy.task12.Read;
import com.infoshareacademy.task13.Tables;
import com.infoshareacademy.task14.Euklides;
import com.infoshareacademy.task2.Operators;
import com.infoshareacademy.task2.Task2;
import com.infoshareacademy.task3.Task3;
import com.infoshareacademy.task4.Task4;
import com.infoshareacademy.task5.Task5;
import com.infoshareacademy.task6.Task6;
import com.infoshareacademy.task7.Admin;
import com.infoshareacademy.task7.Developer;
import com.infoshareacademy.task7.User;
import com.infoshareacademy.task8.Apple;
import com.infoshareacademy.task8.Generic;
import com.infoshareacademy.task8.Orange;
import com.infoshareacademy.task9.Task9;

import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception{


//        Developer u1 = new Developer();
//        u1.setRola("dev");
//
//        Admin a1 = new Admin();
//        a1.setRola("admin");
//
//        u1.showinfo();
//        a1.showinfo();
//
//        Generic<Apple> apple = new Generic<>(new Apple());
//        Generic<Orange> orange = new Generic<>(new Orange());
//
//            orange.getItem();
//            apple.getItem();
//            int[] tab = {5,3,11,14,2,6,13,8};
//            Task9 t9 = new Task9();
//            t9.bubbleSort(tab);
//
//        Fraction f1 = new Fraction();
//        Fraction f2 = new Fraction();
//        Fraction f3 = new Fraction();
//        Fraction f4 = new Fraction();
//
//        f1.calculate(4,2);
//        f2.calculate(3,4);
//        f3.calculate(1,2);
//        f4.calculate(2,5);
//        Decimal.Binary();

//        Read.read();

 //       Tables tab1 = new Tables();
        // tab1.enterData();
//        Euklides euklides = new Euklides();
//        euklides.firstPrint();
        int[] a = new int[100];
        for (int i = 1; i < 100; i++) {
            if(i%100==0) a[i]=i;
        }
        for (int b: a) {
            System.out.println(b);
        }
        }
    }

