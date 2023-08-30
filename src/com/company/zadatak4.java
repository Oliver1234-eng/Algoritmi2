package com.company;

import java.util.Scanner;

public class zadatak4 {

    public static void main(String[] args) {
        // 4. Omoguciti korisniku da unosi brojeve sve dok ne unese broj 􀀀1. Nakon toga program treba da
        // ispiše ukupan broj unetih neparnih brojeva.
        Scanner scanner = new Scanner(System.in);
        int broj;
        int brojNeparnih = 0;

        do {
            System.out.print("Unesite broj (-1 za izlaz): ");
            broj = scanner.nextInt();

            if (broj != -1 && broj % 2 == 1) {
                brojNeparnih++;
            }

        } while (broj != -1);

        System.out.println("Ukupan broj unetih neparnih brojeva: " + brojNeparnih);
    }
}
