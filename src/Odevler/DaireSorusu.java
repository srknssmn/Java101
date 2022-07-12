package Odevler;

import java.util.Scanner;

public class DaireSorusu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r,pi, cevre, alan;

        System.out.print("Dairenin yari capi kac? ");

        r=input.nextDouble();
        pi= 3.14;
        cevre= 2*pi*r;
        alan= pi*r*r;

        System.out.println("Dairenin Cevresi: " + cevre);
        System.out.print("Dairenin Alani: " + alan);

    }
}
