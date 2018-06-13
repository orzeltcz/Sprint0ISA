package com.infoshareacademy.task17;


import java.text.DecimalFormat;

public abstract class FigurePrint {

   public void print(Figure f){
        StringBuilder sb = new StringBuilder();
        sb.append("|-------------\t|--------------\t|\n");
        sb.append("|    POLE     \t|    OBWÓD     \t|\n");
        sb.append("|-------------\t|--------------\t|\n");
        sb.append("|  "+String.format("%.2f",f.pole())+"\t    |   "+String.format("%.2f",f.obwod())+"\t    |\n");
        sb.append("|-------------\t|--------------\t|\n");
       System.out.println(sb);
    }
}
