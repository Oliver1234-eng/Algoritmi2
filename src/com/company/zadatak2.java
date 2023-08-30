package com.company;

import java.util.Scanner;

public class zadatak2 {

    public static void main(String[] args) {
        // 2. Napiši program koji racuna cenu poziva na osnovu njegovog trajanja u sekundama. Telekomunikacijska
        // kompanija naplacuje pozive na sledeci nacin: fiksni troškovi iznose 100 RSD, a ostatak je
        // opisan u tabeli:
        // trajanje poziva(s)   cena/s
        //    1 - 500            0.1
        //  501 - 800            0,05
        //    801+               0,005
        // Korisnik sa tastature unosi trajanje poziva u sekundama i ispisuje mu se ukupna cena poziva.

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite trajanje poziva (u sekundama): ");
        int trajanje = sc.nextInt();

        int fiksniTroskovi = 100;
        double cenaPoSekundi;
        if (trajanje <= 500) {
            cenaPoSekundi = 0.1;
        } else if (trajanje <= 800) {
            cenaPoSekundi = 0.05;
        } else {
            cenaPoSekundi = 0.005;
        }
        double ukupnaCena = fiksniTroskovi + trajanje * cenaPoSekundi;

        System.out.println("Ukupna cena poziva je: " + ukupnaCena + " RSD");

        sc.close();
    }

}
