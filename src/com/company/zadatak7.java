package com.company;

import java.util.Scanner;

public class zadatak7 {

    public static void main(String[] args) {
        // 7. Napiši funkciju koja racuna prosek brojeva koje unosi korisnik. Prvo je potrebno uneti broj brojeva
        // koje treba sabrati, potom treba uneti sve brojeve i na kraju ispisati vrednost proseka.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite broj brojeva koje treba sabrati: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite " + (i+1) + ". broj: ");
            int broj = scanner.nextInt();
            sum += broj;
        }

        double prosek = (double) sum / n;
        System.out.println("Prosek unetih brojeva je: " + prosek);
    }
}
