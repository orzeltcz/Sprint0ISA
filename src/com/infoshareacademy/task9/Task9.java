package com.infoshareacademy.task9;



public class Task9 {

    public void bubbleSort(int[] tab) {
        int temp = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 1; j < (tab.length - i); j++) {

                if (tab[j - 1] > tab[j]) {
                    temp = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = temp;
                }
            }
            for (int k = 0; k <tab.length; k++) {
                System.out.print(tab[k]+" ");
            }
            System.out.println();
        }

    }
}
