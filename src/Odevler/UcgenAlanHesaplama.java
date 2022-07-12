package Odevler;

import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a,b,c,d,e;

        System.out.print("Ucgenin ilk kenarini giriniz: ");
        a = input.nextDouble();
        System.out.print("Ucgenin ikinci kenarini giriniz: ");
        b = input.nextDouble();
        System.out.print("Ucgenin ucuncu kenarini giriniz: ");
        c = input.nextDouble();

        d = ((a+b+c)/2);
        e = Math.sqrt(d * (d-a)* (d-b) * (d-c));

        System.out.print("Ucgenin Alani: " + e);

    }
}
