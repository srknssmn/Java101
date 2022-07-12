package Odevler;

import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double anaPara;

        System.out.print("Ucret Ne Kadar? ");

        anaPara = input.nextDouble();

        boolean kosul = anaPara<=1000;
        double kdvOrani = kosul ? 0.18: 0.8;
        double kdvTutari = anaPara*kdvOrani;

        System.out.println("Ana Para: " + anaPara);
        System.out.println("KDV Orani: " + kdvOrani);
        System.out.println("KDV Tutari: " + kdvTutari);
        System.out.println("KDVli Fiyat: " + (anaPara+kdvTutari));

    }
}
