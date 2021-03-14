package Zad02;

import java.util.Scanner;

public class Zad02 {

    /*  Napiši program koji računa cenu poziva na osnovu njegovog trajanja u sekundama. Telekomunikacijska kompanija naplaćuje pozive na sledeći način: fiksni troškovi iznose 100 RSD, a ostatak je
        opisan u tabeli
        trajanje poziva (s) cena/s
        1 − 500 0.1
        501 − 800 0,05
        801+ 0,005
        Korisnik sa tastature unosi trajanje poziva u sekundama i ispisuje mu se ukupna cena poziva

     */

    public static void main(String[] args) {

        System.out.println("Please enter call duration in seconds: ");

        Scanner timeInput = new Scanner(System.in);
        int time = timeInput.nextInt();

        double price = 100;

        if (time >= 1 && time <= 500) {
            price = price + time * 0.1;
        }

        if (time >= 500 && time <= 800) {
            price = price + time * 0.05;
        }

        if (time >= 801) {
            price = price + time * 0.005;
        }

        System.out.println("Your price for call is: .2f" + price);
    }
}
