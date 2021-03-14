package Zad03;

import java.util.Scanner;

public class Zad03 {

    /*  Napisati program koji omogućava korisniku da unese broj apartmana za koji želi da uporedi cene,
        nakon čega unosi cene apartmana. Program zatim računa prosečnu cenu apartmana i ispisuje
        koliko se svaka pojedinačna cena razlikuje od proseka.

     */

    public static void main(String[] args) {

        System.out.println("Please enter the number of rooms which you want to compare: ");

        Scanner roomsInput = new Scanner(System.in);
        int rooms = roomsInput.nextInt();
        double[] prices = new double[rooms];

        for (int i = 0; i < rooms; i++) {

            Scanner priceInput = new Scanner(System.in);
            double price = priceInput.nextDouble();
            prices[i] = price;
        }

        double sum = 0;

        for (int i = 0; i < prices.length; i++) {

            sum = sum + prices[i];
        }

        double average = sum / prices.length;
        System.out.println("Price average: " + average);

        for (int i = 0; i < prices.length; i++) {

            double difference = prices[i] - average;
            System.out.printf("The room " + (i + 1) + " price difference based on average " + "price is: %.2f\n", difference);
        }
    }
}
