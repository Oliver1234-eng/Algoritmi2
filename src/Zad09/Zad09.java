package Zad09;

import java.util.Scanner;

public class Zad09 {

    /* Pozitivan ceo broj x > 2 je prost ako u intevalu [2,
    √x] ne postoji ni jedan broj koji x deli bez
    ostatka. Napiši funkciju koja proverava da li je broj prost. Funkcija treba da primi broj za koji se
    proverava da li je prost, a da vrati true ako jeste, a false ako nije.


     */


    public static boolean primeNumber(int n) {

        boolean isPrimeNumber = true;

        if (n == 0 || n == 1) {
            isPrimeNumber = false;
        }
        else if (n == 2) {
            isPrimeNumber = true;
        }
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
        }

        return isPrimeNumber;
    }

    public static void main(String[] args) {

        System.out.println("Please enter number: ");
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        boolean result = primeNumber(number);

        if (result == true) {
            System.out.println("Number " + number + " is prime number!");
        }
        else {
            System.out.println("Number " + number + " is not prime number!");
        }
    }
}
