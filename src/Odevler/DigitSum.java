package Odevler;
import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, basamaktakiSayi,sonuc=0;
        System.out.print("Bir Sayi Giriniz: ");
        sayi = input.nextInt();

        while (sayi!=0){
            basamaktakiSayi=sayi%10;
            sonuc+=basamaktakiSayi;
            sayi/=10;
        }
        System.out.println(sonuc);
    }
}
