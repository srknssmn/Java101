package Odevler;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Değişkenleri oluştur.
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Kullanıcıdan değerleri al.

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Turkce notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("Muzik notunuz: ");
        muzik = input.nextInt();

        double toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6.0;

        System.out.println("Not Ortalamaniz: " + sonuc);

        int gecernot = 60;
        boolean kosul = sonuc >= gecernot;

        String genelSonuc = kosul ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(genelSonuc);

    }


}
