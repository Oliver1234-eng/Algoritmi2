package Zad08;

public class Zad08 {

    /*  Napiši funkciju koja računa aproksimaciju broja π kao delimičnu sumu reda: 4/1 − 4/3 + 4/5 −
    4/7 + 4/9... Funkcija očekuje broj članova reda koje treba sabrati i vraća izračunatu vrednost.

     */

    public static double func() {

        double pi = 0;
        double divider = -1;

        for (int i = 0; i < 100000; i++) {

            if (i % 2 == 0) {
                pi = pi + 4 / divider;
            }
            if (i % 2 != 0) {
                pi = pi - 4 / divider;
            }

            divider = divider + 2;
        }

        return pi;
    }

    public static void main(String[] args) {

        double result = func();
        System.out.println("Value of number PI is: " + result);
    }
}
