package Odevler;

import java.util.Scanner;
public class HipotenusHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c;

        System.out.print("Ucgenin ilk kenarini yaziniz: ");
        a = input.nextDouble();

        System.out.print("Ucgenin ikinci kenarini yaziniz: ");
        b = input.nextDouble();

        c = Math.sqrt ((a*a) + (b*b));

        System.out.print("Hipotenus: " + c);








    }
}
