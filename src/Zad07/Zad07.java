package Zad07;

import java.util.Scanner;

public class Zad07 {

    /* Napiši funkciju koja računa prosek brojeva koje unosi korisnik. Prvo je potrebno uneti broj brojeva
    koje treba sabrati, potom treba uneti sve brojeve i na kraju ispisati vrednost proseka.

     */

    public static double average(int n) {

        double sum = 0;

        Scanner arrayInput = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter the " + (i + 1) + ". element of array: ");
            double array = arrayInput.nextDouble();
            sum = sum + array;
        }

        double average = sum / n;

        return average;
    }

    public static void main(String[] args) {

        System.out.println("Please enter the number of elements: ");
        Scanner numberInput = new Scanner(System.in);
        int n = numberInput.nextInt();
        double result = average(n);
        System.out.println("Average of elements is: " + result);
    }
}
