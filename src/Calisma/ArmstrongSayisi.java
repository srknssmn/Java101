package Calisma;
import java.util.Scanner;
public class ArmstrongSayisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, digits=0;
        System.out.print("Bir Sayi Giriniz: ");
        sayi=input.nextInt();

        while (!(sayi==0)){
            sayi/=10;
            digits++;
        }
    }
}
