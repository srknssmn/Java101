package Odevler;

import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double ar=2.14,el=3.67,dom=1.11,muzz=0.95,pat=5;

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

        double toplam= (armut*ar)+(elma*el)+(domates*dom)+(muz*muzz)+(patlican*pat);
        System.out.print("Toplam Odemeniz: "+toplam+ "TL");

    }
}
