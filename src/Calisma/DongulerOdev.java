package Calisma;
import java.util.Scanner;
public class DongulerOdev {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //0'dan girilen sayıya kadar olan sayılardan; 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        int sayi;
        System.out.print("Bir sayi giriniz: ");
        sayi= input.nextInt();

        for(int i=1; i<sayi;i++){
            if(i%2==0) {
                System.out.print(i + " ");
            }
        }
    }
}
