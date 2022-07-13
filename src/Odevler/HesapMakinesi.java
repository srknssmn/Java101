package Odevler;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1,n2,n3;

        System.out.print("Ilk Sayiyi Giriniz: ");
        n1=input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz: ");
        n2=input.nextInt();
        System.out.println("Toplama icin 1\nCikarma icin 2\nCarpma icin 3\nBolme icin 4");
        System.out.print("Hangi Islemi Seciyorsunuz? ");
        n3=input.nextInt();

        switch (n3){
            case 1:
                System.out.println("Sonucunuz: " +(n1+n2));
                break;
            case 2:
                System.out.println("Sonucunuz: " +(n1-n2));
                break;
            case 3:
                System.out.println("Sonucunuz: " +(n1*n2));
                break;
            case 4:
                if (n2!=0){
                    System.out.println("Sonucunuz: " +(n1/n2));
                    }else{
                    System.out.println("0 a Bolunemez!");
                }
                break;
            default:
                System.out.println("Dogru Bir Deger Giriniz");
                break;


        }

    }
}
