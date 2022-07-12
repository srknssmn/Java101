package Odevler;

import java.util.Scanner;

public class DaireAlanSorusu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r,pi,a,alan;

        System.out.print("Dairenin Yari Capini Giriniz: ");
        r= input.nextDouble();
        System.out.print("Dairenin Merkez Acisini Giriniz: ");
        a= input.nextDouble();

        pi=3.14;

        alan= (pi*(r*r)*a)/360;

        System.out.print("Dairenin Alani:" + alan);

    }
}
