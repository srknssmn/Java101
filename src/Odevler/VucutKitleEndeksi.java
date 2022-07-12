package Odevler;

import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a,b,endeks;

        System.out.print("Lutfen Kilonuzu Giriniz: ");
        a= input.nextDouble();

        System.out.print("Lutfen Boyunuzu Metre Cinsinde Giriniz: ");
        b= input.nextDouble();

        endeks=a/Math.pow(b,2);
        System.out.print("Vucut Kitle Endeksiniz: " + endeks);
    }
}
