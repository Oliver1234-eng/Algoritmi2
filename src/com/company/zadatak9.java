package com.company;

import java.util.Scanner;

public class zadatak9 {

    public static void main(String[] args) {
        // 9. Pozitivan ceo broj x > 2 je prost ako u intevalu [2, sqrt(x)] ne postoji ni jedan broj koji x deli bez
        // ostatka. Napiši funkciju koja proverava da li je broj prost. Funkcija treba da primi broj za koji se
        // proverava da li je prost, a da vrati true ako jeste, a false ako nije.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi broj za proveru da li je prost: ");
        int x = scanner.nextInt();
        if (isPrime(x)) {
            System.out.println("Broj " + x + " je prost.");
        } else {
            System.out.println("Broj " + x + " nije prost.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int sqrtNum = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrtNum; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
