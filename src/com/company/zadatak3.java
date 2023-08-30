package com.company;

import java.util.Scanner;

public class zadatak3 {

    public static void main(String[] args) {
        // 3. Napisati program koji omogucava korisniku da unese broj apartmana za koji želi da uporedi cene,
        // nakon cega unosi cene apartmana. Program zatim racuna prosecnu cenu apartmana i ispisuje
        // koliko se svaka pojedinacna cena razlikuje od proseka.

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj apartmana: ");
        int n = sc.nextInt();

        int[] cene = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Unesite cenu za apartman broj %d: ", i + 1);
            cene[i] = sc.nextInt();
        }

        int suma = 0;
        for (int cena : cene) {
            suma += cena;
        }
        double prosecnaCena = (double) suma / n;

        System.out.printf("Prosecna cena apartmana je: %.2f\n", prosecnaCena);
        for (int i = 0; i < n; i++) {
            double razlika = cene[i] - prosecnaCena;
            System.out.printf("Razlika za apartman broj %d je: %.2f\n", i + 1, razlika);
        }
    }
}
