package com.infoshareacademy.task17;

public class Trojkat extends FigurePrint implements Figure{
  private double a;
  private double b;
  private double c;
   private double h;

   public Trojkat(double a,double b, double c, double h){
        this.a=a;
        this.b=b;
        this.c=c;
        this.h=h;
    }
    @Override
    public double pole() {
        return (a*h)/2;
    }

    @Override
    public double obwod() {
        return a+b+c;
    }
}
