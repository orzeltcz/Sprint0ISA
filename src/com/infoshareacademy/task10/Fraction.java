package com.infoshareacademy.task10;

public class Fraction {
    Integer counter;
    Integer denominator;
    double value;
    public void calculate(int counter, int denominator){
        this.counter=counter;
        this.denominator=denominator;
        this.value=this.counter.doubleValue()/this.denominator.doubleValue();
        System.out.println(this.value +" ["+counter+"/"+denominator+"]");
    }

}
