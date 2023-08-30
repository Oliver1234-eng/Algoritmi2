package com.company;

public class zadatak5 {

    public static void main(String[] args) {
        // 5. Napisati funkciju koja kao prvi parametar prima ceo broj, a kao drugi parametar prima niz brojeva.
        // Funkcija pronalazi element niza koji je najbliži unetom broju, zatim zamenjuje pronadjeni element
        // sa unetim brojem i ispisuje ga.

        int[] niz = {2, 4, 7, 10, 13};
        zamenaNajblizi(8, niz);
    }

    public static void zamenaNajblizi(int n, int[] niz) {
        int najblizi = niz[0];
        for (int i = 1; i < niz.length; i++) {
            if (Math.abs(n - niz[i]) < Math.abs(n - najblizi)) {
                najblizi = niz[i];
            }
        }

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] == najblizi) {
                niz[i] = n;
                break;
            }
        }

        System.out.print("Novi niz: ");
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }
        System.out.println();
    }
}
