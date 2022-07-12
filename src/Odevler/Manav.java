package Odevler;

import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armutFiyat=2.14,elmaFiyat=3.67,domatesFiyat=1.11,muzFiyat=0.95,patlicanFiyat=5;

        double armut,elma,domates,muz,patlican;

        System.out.print("Kac kg armut aldiniz? ");
        armut=input.nextDouble();
        System.out.print("Kac kg elma aldiniz? ");
        elma=input.nextDouble();
        System.out.print("Kac kg domates aldiniz? ");
        domates=input.nextDouble();
        System.out.print("Kac kg muz aldiniz? ");
        muz=input.nextDouble();
        System.out.print("Kac kg patlican aldiniz? ");
        patlican=input.nextDouble();

        double toplam= (armut*armutFiyat)+(elma*elmaFiyat)+(domates*domatesFiyat)+(muz*muzFiyat)+(patlican*patlicanFiyat);
        System.out.print("Toplam Odemeniz: "+toplam+ "TL");

    }
}
