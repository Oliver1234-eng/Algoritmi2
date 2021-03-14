package Zad01;

import java.util.Scanner;

public class Zad01 {

    /* Napiši program koji računa ukupnu cenu proizvoda poručenih sa Amazona. Cena dostave zavisi
    od mesta isporuke, za Ameriku je 5$, za Evropu 7$, za ostale države je 9$. Korisnik sa tastature
    unosi cenu proizvoda i svoju lokaciju (Amerika, Evropa, Ostale zemlje) i nakon toga mu se ispisuje
    ukupna cena proizvoda.
    */

    public static void main(String[] args) {

        System.out.println("Please enter your price (in USD): ");

        Scanner priceInput = new Scanner(System.in);
        double price = priceInput.nextDouble();
        System.out.println("Please select a country for shipping: \n" + "1) America \n"
        + "2) Europe \n" + "3) Other \n");

        Scanner countryInput = new Scanner(System.in);
        double country = countryInput.nextDouble();

        if (country == 1) {
            price = price + 5;
        }

        else if (country == 2) {
            price = price + 7;
        }

        else if (country == 3) {
            price = price + 9;
        }

        System.out.println("Your price with shipping is: %.2f USD: " + price);

    }
}
