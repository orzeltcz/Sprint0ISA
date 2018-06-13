package com.infoshareacademy.task17;

public class Prostokat extends FigurePrint implements Figure{
   private double bokA;
    private double bokB;
    public Prostokat(double a, double b){
        this.bokA = a;
        this.bokB = b;
    }
    @Override
    public double pole() {

        return bokA*bokB;
    }

    @Override
    public double obwod() {
        return 2*bokA+2*bokB;
    }
}
