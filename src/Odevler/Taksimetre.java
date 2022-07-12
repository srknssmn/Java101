package Odevler;

import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a,b,c;

        System.out.println("Hos Geldiniz, KM Basince Ucret: 2.20 TL'dir.");
        System.out.println("Taksi Acilis Fiyati: 10 TL'dir.");
        System.out.println("Ayrica min. Odeme: 20 TL'dir.");
        System.out.print("Taksi ile gidilen mesafeyi yaziniz: ");
        a= input.nextDouble();

        b= 10;
        c=b+(a*2.2);

        c= c>=20 ? c : 20;
        System.out.println("Ucret: " + c + "TL");

    }
}
