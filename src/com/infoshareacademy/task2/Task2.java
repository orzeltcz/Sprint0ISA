package com.infoshareacademy.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    //Dane wejsciowe
    public static void enterData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: dodawanie");
        System.out.println("2: odejmowanie");
        System.out.println("3: mnozenie");
        System.out.println("4: dzielenie");
        System.out.println("Podaj działanie:");
        try {
            int wybor = scanner.nextInt();
            if (wybor > 4 || wybor < 1) {
                System.out.println("Podaj liczbe od 1 do 4");
            } else {

                System.out.println("Podaj ilosc liczb");
                int numberOfNumbers = scanner.nextInt();
                double table[] = new double[numberOfNumbers];
                System.out.println("Podaj liczby: ");
                for (int i = 0; i < numberOfNumbers; i++) {
                    table[i] = scanner.nextDouble();
                }
                double wynik = dzialanie(wybor, table);
                System.out.print(wynik);

            }
        } catch (InputMismatchException e) {
            System.out.println("Podaj liczbę całkowitą");
        }
    }
    //Kalkulator zwracajacy wyniki
    private static double dzialanie(int opcja, double[] liczbyDoDzialania) {
        double suma = 0, roznica = liczbyDoDzialania[0], iloczyn = liczbyDoDzialania[0], iloraz = liczbyDoDzialania[0];
        switch (opcja) {
            case 1: {
                for (int i = 0; i < liczbyDoDzialania.length; i++) {
                    if (i != 0) System.out.print("+");
                    System.out.print(liczbyDoDzialania[i]);
                    if (i != liczbyDoDzialania.length - 1)
                        suma = suma + liczbyDoDzialania[i];
                }
                System.out.print("=");
                return suma;
            }
            case 2: {
                System.out.print(liczbyDoDzialania[0]);
                for (int i = 1; i < liczbyDoDzialania.length; i++) {
                     System.out.print("-");
                    System.out.print(liczbyDoDzialania[i]);
                    roznica = roznica - liczbyDoDzialania[i];
                }
                System.out.print("=");
                return roznica;

            }
            case 3: {
                System.out.print(liczbyDoDzialania[0]);
                for (int i = 1; i < liczbyDoDzialania.length; i++) {
                     System.out.print("*");
                    System.out.print(liczbyDoDzialania[i]);
                    iloczyn = iloczyn * liczbyDoDzialania[i];
                }
                System.out.print("=");
                return iloczyn;

            }
            case 4: {
                System.out.print(liczbyDoDzialania[0]);
                for (int i = 1; i < liczbyDoDzialania.length; i++) {
                    System.out.print("/");
                    System.out.print(liczbyDoDzialania[i]);
                    iloraz = iloraz / liczbyDoDzialania[i];
                }
                System.out.print("=");
                return iloraz;

            }

        }
        return 0;
    }
}
