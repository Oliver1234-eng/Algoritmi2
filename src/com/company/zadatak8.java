package com.company;

public class zadatak8 {

    public static void main(String[] args) {
        // 8. Napiši funkciju koja racuna aproksimaciju broja Pi kao delimicnu sumu reda: 4/1 - 4/3 + 4/5 -
        // 4/7 + 4/9... Funkcija ocekuje broj clanova reda koje treba sabrati i vraca izracunatu vrednost.
        int numTerms = 1000;
        double pi = approxPi(numTerms);
        System.out.println("Pi approximation: " + pi);
    }

    public static double approxPi(int numTerms) {
        double pi = 0;
        int sign = 1;
        for (int i = 1; i <= numTerms; i++) {
            pi += sign * 4.0 / (2 * i - 1);
            sign = -sign;
        }
        return pi;
    }
}
