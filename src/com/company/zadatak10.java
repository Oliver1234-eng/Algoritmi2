package com.company;

import java.util.Scanner;

public class zadatak10 {

    public static void main(String[] args) {
        // 10. Napisati program koji simulira rad privatnog parkinga. Vozac unosi koliko je sati bio parkiran i da
        // li je clan kluba. Ukoliko je clan placa fiksne troškove u iznosu od 100 RSD, a ako nije placa 200 RSD.
        // Cena parkinga po satu za prvi sat iznosi 200 RSD, za drugi sat 150 RSD, za treci 100 RSD,
        // a nakon cetvrtog sata cena je 50 RSD. Program treba da omoguci proizvoljan broj ovakvih unosa.
        // Kada korisnik izabere da izadje iz programa ispisuje mu se broj vozaca i ukupna zarada.
        Scanner input = new Scanner(System.in);

        int totalCars = 0;
        int totalRevenue = 0;

        while (true) {
            System.out.print("Unesite broj sati provedenih na parkingu (ili -1 za izlaz): ");
            int hours = input.nextInt();
            if (hours == -1) {
                break;
            }

            System.out.print("Da li ste clan kluba? (da/ne): ");
            String member = input.next();

            int fixedCost = (member.equals("da")) ? 100 : 200;
            int hourlyRate = 0;

            if (hours <= 0) {
                System.out.println("Neispravan unos.");
                continue;
            } else if (hours == 1) {
                hourlyRate = 200;
            } else if (hours == 2) {
                hourlyRate = 200 + 150;
            } else if (hours == 3) {
                hourlyRate = 200 + 150 + 100;
            } else {
                hourlyRate = 200 + 150 + 100 + 50 * (hours - 3);
            }

            int cost = fixedCost + hourlyRate;
            System.out.println("Cena parkiranja: " + cost + " RSD\n");

            totalCars++;
            totalRevenue += cost;
        }

        System.out.println("Broj vozaca: " + totalCars);
        System.out.println("Ukupna zarada: " + totalRevenue + " RSD");
    }
}
