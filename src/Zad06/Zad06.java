package Zad06;

import java.util.Scanner;

public class Zad06 {

    /* U redu u samoposluzi nalazi se n kupaca. Vreme za koje kasirka opslužuje svakog kupca dato
    je nizom t[0], t[1], ..., t[n − 1]. Napisati funkciju koja određuje čekanje svakog kupca i nakon toga
    ispisuje razultat. Za niz [4, 9, 10, 22, 13], vremena čekanja treba da budu sledeća: 4, 13, 23, 45, 58.

     */

    public static void main(String[] args) {

        Scanner numberInput = new Scanner(System.in);

        System.out.println("Please enter the number of costumers: ");
        int n = numberInput.nextInt();
        int[] array = new int[n];
        Scanner arrayInput = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Please enter the wait time of " +  (i + 1) + ". costumer: ");
            int seconds = arrayInput.nextInt();
            array[i] = seconds;
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
            System.out.println("Waiting time for " + (i + 1) + ". costumer is: " + sum);
        }
    }
}
