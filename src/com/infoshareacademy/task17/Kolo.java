package com.infoshareacademy.task17;

public class Kolo extends FigurePrint implements Figure{
   private double r;
   public Kolo(double r){
       this.r = r;
   }
    @Override
    public double pole() {
        return Math.PI*r*r;
    }

    @Override
    public double obwod() {
        return 2*Math.PI*r;
    }
}
