package com.infoshareacademy.task3;

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    int y;
    int z;
    int interval;
    Scanner skaner = new Scanner(System.in);

   public void przedzialy () {
       System.out.println("Podaj liczbe i przedzialy");
       this.y = skaner.nextInt();
       this.z = skaner.nextInt();
       this.interval = y/z;

       losuj(interval);
   }
private void losuj(int interval){
       int helperInterval = interval;
       int[] wynik = new int[z];
    Random random = new Random();
    int rand;
    System.out.println("Podaj ilosc losowan");
    int amountOfRoll = skaner.nextInt();
    for (int i = 0; i < amountOfRoll; i++) {
        rand = random.nextInt(y);
        for (int j = 0; j <z; j++) {
            if (rand < helperInterval) {
                wynik[j] += 1;
                helperInterval=this.interval;
                break;
            }
            helperInterval+=this.interval;
        }
    }
    System.out.println(helperInterval);
    print(wynik,helperInterval);
}
private void print(int[] wynik, int helperInterval){
    for (int i = 0; i < z; i++,helperInterval+=interval) {
        if(i==0) System.out.print("0-"+helperInterval);
          else  System.out.print((helperInterval-interval)+"-"+helperInterval);
        System.out.println(" ilość trafień: "+wynik[i]);
    }
}

}
