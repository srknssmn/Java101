package Calisma;
import java.util.Scanner;
public class Faktoriyel {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        // n! = 1 * 2 * 3 * 4 * 5 * ..... * n
        /*
        int sayi,total=1;
        System.out.print("Bir sayi giriniz: ");
        sayi= input.nextInt();

        for(int i=1; i<=sayi;i++){
            total=total*i;
        }
        System.out.print("Faktoriyel: " + total);
         */
        int sayi,i=1,total=1;
        System.out.print("Bir sayi giriniz: ");
        sayi= input.nextInt();

        while (i<=sayi){
            total=total*i;
            i++;
        }
        System.out.println("Faktoriyel: " + total);
    }
}
