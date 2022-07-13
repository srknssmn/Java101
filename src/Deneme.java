import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        double km, kmPer,ucret;

        kmPer=2.20;
        System.out.print("Kac KM Yol Gideceksiniz? ");
        km= input.nextDouble();

        ucret=(10+(km*kmPer);

        double kosul = ucret<20 ? 20 : ucret;

        System.out.print("Odeyeceginiz Ucret: ");
        System.out.print(kosul + "TL");
        */

        int a,b,c;

        a=3;
        b=4;
        c=5;
        boolean kosul = a>b;

        if (kosul){
            System.out.println("Dogru");
        }else {
            System.out.println("Dogru Degil");
        }

    }
}