package Zad05;

public class Zad05 {

    /*  Napisati funkciju koja kao prvi parametar prima ceo broj, a kao drugi parametar prima niz brojeva.
        Funkcija pronalazi element niza koji je najbliži unetom broju, zatim zamenjuje pronađeni element
        sa unetim brojem i ispisuje ga.

     */

    public static double [] func(int a, double [] b) {

        int enteredNumber = a;
        double arrayNum [] = b;
        double difference [] = new double[arrayNum.length];
        double min = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            difference[i] = Math.abs(enteredNumber - arrayNum[i]);

            if (i == 0) {
                min = difference[0];
            }

            if (min > difference[i]) {
                min = difference[i];
            }
        }

        for (int j = 0; j < difference.length; j++) {

            if (min == difference[j]) {
                System.out.println("\nThe closest number of " + enteredNumber + " in array is: " + arrayNum[j]);
                arrayNum[j] = enteredNumber;
            }
        }

        return arrayNum;
    }

    public static void main(String[] args) {

        double [] array = {12, 25, 43, 29};

        System.out.print("Old array is: ");

        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }

        double [] result = func(20, array);

        System.out.print("New array is: ");

        for (int k = 0; k < result.length; k++) {
            System.out.print(result[k] + " ");
        }

    }
}
