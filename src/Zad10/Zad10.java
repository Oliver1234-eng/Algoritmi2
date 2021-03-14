package Zad10;

import java.util.Scanner;

public class Zad10 {

    /*  Napisati program koji simulira rad privatnog parkinga. Vozač unosi koliko je sati bio parkiran i da
    li je član kluba. Ukoliko je član plaća fiksne troškove u iznosu od 100 RSD, a ako nije plaća 200
    RSD. Cena parkinga po satu za prvi sat iznosi 200 RSD, za drugi sat 150 RSD, za treći 100 RSD,
    a nakon četvrtog sata cena je 50 RSD. Program treba da omogući proizvoljan broj ovakvih unosa.
    Kada korisnik izabere da izađe iz programa ispisuje mu se broj vozača i ukupna zarada.

     */

    public static void main(String[] args) {

        boolean stop = false;
        int key;
        int totalPrice = 0;
        int driver = 0;

        while (stop == false) {

            Scanner timeInput = new Scanner(System.in);
            System.out.println("Please enter how long you have been using the parking service (HH:MM:SS): ");
            String time = timeInput.nextLine();
            String [] splitTime = time.split(":");
            int seconds = 0;

            if (splitTime.length == 3) {
                seconds = Integer.parseInt(splitTime[0]) * 3600 + Integer.parseInt(splitTime[1]) * 60 + Integer.parseInt(splitTime[2]);
            }
            if (splitTime.length == 2) {
                seconds = Integer.parseInt(splitTime[0]) * 3600 + Integer.parseInt(splitTime[1]) * 60;
            }

            Scanner memberInput = new Scanner(System.in);
            System.out.println("Are you a premium member?\n1) Yes \n2)No");
            int member = memberInput.nextInt();

            int price = 0;

            if (member == 1) {
                price = price + 100;
            }
            if (member == 2) {
                price = price + 200;
            }

            int pricePerHour = 200;

            for (int i = 3600; i < seconds; i += 3600) {

                price = price + pricePerHour;

                if (pricePerHour > 50) {
                    pricePerHour = pricePerHour - 50;
                }
            }

            System.out.println("Price for parking is: " + price + " RSD");
            driver++;
            totalPrice = totalPrice + price;
            Scanner inputKey = new Scanner(System.in);
            System.out.println("Enter 0 for exit, or press 1 to continue");
            key = inputKey.nextInt();

            if (key == 0) {
                stop = true;
            }
            if (key == 1) {
                stop = false;
            }
            System.out.println(key);
        }
        System.out.println("\nNumber of detected drivers: " + driver);
        System.out.println("Total profit: " + totalPrice + " RSD");
    }
}
