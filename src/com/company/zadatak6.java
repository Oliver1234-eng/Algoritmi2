package com.company;

public class zadatak6 {

    public static void main(String[] args) {
        // 6. U redu u samoposluzi nalazi se n kupaca. Vreme za koje kasirka opslužuje svakog kupca dato
        // je nizom t[0], t[1], ..., t[n - 1]. Napisati funkciju koja odredjuje cekanje svakog kupca i nakon toga
        // ispisuje rezultat. Za niz [4, 9, 10, 22, 13], vremena cekanja treba da budu sledeca: 4, 13, 23, 45, 58.
        int[] t = {4, 9, 10, 22, 13};
        cekanjeKupaca(t);
    }

    public static void cekanjeKupaca(int[] t) {
        int n = t.length;
        int[] cekanje = new int[n];
        cekanje[0] = 0;
        for (int i = 1; i < n; i++) {
            cekanje[i] = cekanje[i-1] + t[i-1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(cekanje[i] + t[i] + " ");
        }
    }
}
