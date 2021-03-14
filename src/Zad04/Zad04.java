package Zad04;

import java.util.Scanner;

public class Zad04 {

    /* Omogućiti korisniku da unosi brojeve sve dok ne unese broj −1. Nakon toga program treba da
       ispiše ukupan broj unetih neparnih brojeva.

     */

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double number = 0;
        int counterOdd = -1;

        while(number != -1) {
            number = userInput.nextDouble();

            if (number % 2 != 0) {
                counterOdd++;
            }
        }

        System.out.println(counterOdd);
    }
}
