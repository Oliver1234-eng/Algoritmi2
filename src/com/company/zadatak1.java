package com.company;

import java.util.Scanner;

public class zadatak1 {

    public static void main(String[] args) {
        // 1. Napiši program koji racuna ukupnu cenu proizvoda porucenih sa Amazona. Cena dostave zavisi
        // od mesta isporuke, za Ameriku je 5$, za Evropu 7$, za ostale države je 9$. Korisnik sa tastature
        // unosi cenu proizvoda i svoju lokaciju (Amerika, Evropa, ostale zemlje) i nakon toga mu se ispisuje
        // ukupna cena proizvoda.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite cenu proizvoda: ");
        double cenaProizvoda = scanner.nextDouble();

        System.out.print("Unesite lokaciju (Amerika, Evropa, ostale zemlje): ");
        String lokacija = scanner.next();

        double cenaDostave = 0;
        if (lokacija.equals("Amerika")) {
            cenaDostave = 5.0;
        } else if (lokacija.equals("Evropa")) {
            cenaDostave = 7.0;
        } else if (lokacija.equals("ostale zemlje")){
            cenaDostave = 9.0;
        } else {
            System.out.println("Takva lokacija ne postoji");
            System.out.print("Unesite lokaciju (Amerika, Evropa, ostale zemlje): ");
            lokacija = scanner.next();
            if (lokacija.equals("Amerika")) {
                cenaDostave = 5.0;
            } else if (lokacija.equals("Evropa")) {
                cenaDostave = 7.0;
            } else if (lokacija.equals("ostale zemlje")){
                cenaDostave = 9.0;
            }
        }

        double ukupnaCena = cenaProizvoda + cenaDostave;
        System.out.println("Ukupna cena proizvoda je: " + ukupnaCena);
    }
}
