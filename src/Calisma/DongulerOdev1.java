package Calisma;
import java.util.Scanner;
public class DongulerOdev1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int a,total=0;

        do {
            System.out.print("Bir sayi giriniz: ");
            a= input.nextInt();
            if(a%2==1) {
                total+= a;
                System.out.println(total);
            }
        }while (a>=0);
            System.out.println("Yanlis sayi girdiniz!");
    }
}
