package Calisma;

import java.util.Scanner;
public class HesapMakinesiDeneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1,n2,n3;

        System.out.print("Ilk Sayiyi Giriniz: ");
        n1=input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz: ");
        n2= input.nextInt();
        System.out.println("Toplama icin 1\nCikarma icin 2\nCarpma icin 3\nBolme icin 4");
        System.out.print("Hangi Islemi Seciyorsunuz? ");
        n3= input.nextInt();

        if(n3==1){
            System.out.println("Sonucunuz: " +(n1+n2));
        }else if (n3==2){
            System.out.println("Sonucunuz: " +(n1-n2));
        } else if (n3==3) {
            System.out.println("Sonucunuz: " +(n1*n2));
        }else if (n3==4){
            if (n2 !=0){
                System.out.println("Sonucunuz: " +(n1/n2));
            }else {
                System.out.println("0 a Bolunemez!");
            }
        }else {
            System.out.println("Yanlis Secim Yaptiniz!");
        }
    }
}
