package Calisma;
import java.util.Scanner;
public class ArmstrongSayisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;
        System.out.print("Bir Sayi Giriniz: ");
        sayi=input.nextInt();

        int basamakSayisi=0;
        int geciciSayi= sayi; // Başta aldığımız sayıyı kaybetmemek için geçici kod atıyoruz.
        int basamaktakiSayi;
        int ustu;
        int sonuc=0;

        // Basamak sayısı adedini bulma:
        while (!(geciciSayi==0)){
            geciciSayi/=10;
            basamakSayisi++;
        }
        System.out.println("Toplam Basamak Sayisi: " + basamakSayisi);
        // Basamaklardaki sayıları bulma:
        geciciSayi=sayi;
        while (geciciSayi!=0){
            basamaktakiSayi=geciciSayi%10;
            System.out.println("Basamaktaki Sayi: " + basamaktakiSayi);
            // Üstü alma:
            ustu=1;
            for(int i=1;i<=basamakSayisi;i++){
                ustu*=basamaktakiSayi;
            }
            System.out.println("Basamaktaki Sayinin Ustu: " + ustu);
            // Basamaktaki sayının, Basamak sayısına üstünü toplama ekliyor.
            sonuc+=ustu;
            geciciSayi/=10;
        }
        System.out.println("GENEL SONUC: " + sonuc);
    }
}
