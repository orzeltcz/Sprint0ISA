package com.infoshareacademy.task3;

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    int y;
    int z;
    Scanner skaner = new Scanner(System.in);

   public void przedzialy () {
       System.out.println("Podaj liczbe i przedzialy");
       this.y = skaner.nextInt();
       this.z = skaner.nextInt();
       int[] tab = new int[z];
       tab[0] = y / z;
       for (int i = 1; i < z; i++) {
           tab[i] = tab[i - 1] + tab[0];
       }
       losuj(tab);
   }
private void losuj(int[] tab){
       int[] wynik = new int[tab.length];
    Random random = new Random();
    int rand;
    System.out.println("Podaj ilosc losowan");
    int amountOfRoll = skaner.nextInt();
    for (int i = 0; i < amountOfRoll; i++) {
        rand = random.nextInt(y);
        for (int j = 0; j <z; j++) {
            if (rand < tab[j]) {
                wynik[j] += 1;
                break;
            }
        }
    }
    print(wynik,tab);
}
private void print(int[] wynik,int[] tab){

    for (int i = 0; i < z; i++) {
        if(i==0) System.out.print("0-"+tab[i]);
          else  System.out.print(tab[i-1]+"-"+tab[i]);
        System.out.println(" ilość trafień: "+wynik[i]);
    }
}

}
