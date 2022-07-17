package Calisma;
import java.util.Scanner;
public class BasamakSayisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    // BASAMAK SAYISI BULMA:
        int a;
        int digits=0;

        System.out.print("Bir sayi giriniz: ");
        a= input.nextInt();

        while (!(a==0)){
            a=a/10; // a/=a;
            digits++;
        }
        System.out.println("Basamak Sayisi: " + digits);

        /*
    // SON BASAMAKTAKİ SAYIYI BULMA:
        int b=2451;
        int c= b%10;
        System.out.println("Son Basamak:" + c);
        */

    // SAYININ TAMAMINDAKİ BASAMAK SAYILARINI BULMA:
       /*
        int a,b;
        int digits=0;

        System.out.print("Bir sayi giriniz: ");
        a= input.nextInt();

        System.out.println(a);
        b=a%10;
        System.out.println("Basamaktaki Sayi: " + b);

        while (!(a==0)){
            a=a/10; // a/=a;
            digits++;
            System.out.println(a);
            b=a%10;
            System.out.println("Basamaktaki Sayi: " + b);
        }
        System.out.println();
        System.out.println("Basamak Sayisi: " + digits);
        */
    }
}
